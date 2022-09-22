package main;

import entity.Player;
import world.Map;
import world.MapLayer;
import world.Tile;
import world.World;

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

    final KeyHandler keyH = new KeyHandler();
    public final Player player = new Player(this, keyH);
    Thread gameThread;

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
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
                drawCount = 0;
                timer = 0;
                System.out.println(Tile.a);
                Tile.a = 0;
            }


        }
    }

    public void update() {

        player.update();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        World.g2 = g2;
        Map.g2 = g2;
        MapLayer.g2 = g2;
        Tile.g2 = g2;

        try {
            World.load(this, "/res/maps.ldtk");
        } catch (IOException e) {
            e.printStackTrace();
        }

        player.draw(g2);

        g2.dispose();
    }

}
