package main;

import javax.swing.*;

public class Main {

    static JFrame window = new JFrame();

    public static void main(String[] args) {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("RPG");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }

    public static void setTitle(String title) {
        window.setTitle(title);
    }

}