package entity;

import main.GamePanel;

import java.awt.image.BufferedImage;

public class Entity {

    public int x, y;
    public int speed;

    GamePanel gp;
    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2, upIdle, downIdle, leftIdle, rightIdle;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNumber = 1;

}
