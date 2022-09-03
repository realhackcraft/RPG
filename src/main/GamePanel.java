package main;

import entity.Player;
import io.LevelData;
import tile.TileManager;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GamePanel extends JPanel implements Runnable {

    // SCREEN SETTINGS
    public final int scale = 4;
    final int originalTileSize = 16; // 16 x 16
    public final int tileSize = originalTileSize * scale; // 48 x 48

    public final int maxScreenColumn = 19;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenColumn; // 768 px
    public final int screenHeight = tileSize * maxScreenRow; // 576 px
    public final int FPS = 60;

    final TileManager tileM = new TileManager(this);
    final KeyHandler keyH = new KeyHandler();
    final Player player = new Player(this, keyH);
    Thread gameThread;

    public GamePanel() throws IOException {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.DARK_GRAY);
        this.setDoubleBuffered(true);

        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = (double) 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while (gameThread != null) {

            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if (timer >= 1000000000) {
                Main.setTitle("RPG | FPS: " + drawCount);
                System.out.println(drawCount);
                drawCount = 0;
                timer = 0;
            }

        }
    }

    public void update() {

        player.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        LevelData data = TileManager.data;

        Graphics2D g2 = (Graphics2D) g;

        tileM.draw(g2, data);

        player.draw(g2);

        g2.dispose();
    }

}
