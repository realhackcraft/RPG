package main;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {

    static final JFrame window = new JFrame();

    public static int WIDTH;
    public static int HEIGHT;
    public static int EXTRA_TILES_X = 3;
    public static int EXTRA_TILES_Y = 3;


    public static void main(String[] args) throws IOException {

        EventQueue.invokeLater(() -> {
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setResizable(true);
            window.setTitle("RPG");

            GamePanel gamePanel = new GamePanel();
            window.add(gamePanel);

            window.pack();

            HEIGHT = window.getHeight();
            WIDTH = window.getWidth();

            window.setLocationRelativeTo(null);
            window.setVisible(true);

            gamePanel.startGameThread();
        });

    }

    public static void setTitle(String title) {
        window.setTitle(title);
    }

}