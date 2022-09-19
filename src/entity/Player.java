package entity;

import main.GamePanel;
import main.KeyHandler;
import main.Main;
import world.World;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Player extends Entity {

    final KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        try {
            getPlayerImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
        direction = "down";
    }

    public void setDefaultValues() {

        x = Main.WIDTH / 2;
        y = Main.HEIGHT / 2;
        speed = 5;
    }

    public void getPlayerImage() throws IOException {

        up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/up1.png")));
        up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/up2.png")));
        down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/down1.png")));
        down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/down2.png")));
        left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/left1.png")));
        left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/left2.png")));
        right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/right1.png")));
        right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/right2.png")));
        upIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/up_idle.png")));
        downIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/down_idle.png")));
        leftIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/left_idle.png")));
        rightIdle = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/right_idle.png")));
    }

    public void update() {

        if (keyH.upPressed || keyH.downPressed || keyH.leftPressed || keyH.rightPressed) {

            if (keyH.upPressed) {
                direction = "up";

                if (y <= (Main.HEIGHT / 2) - (25 + upIdle.getHeight()) * gp.scale) {
                    World.cameraOffsetY += speed;
                } else {
                    y -= speed;
                }
            } else if (keyH.leftPressed) {
                direction = "left";

                if (x <= (Main.WIDTH / 2) - (25 + upIdle.getWidth()) * gp.scale) {
                    World.cameraOffsetX += speed;
                } else {
                    x -= speed;
                }

            } else if (keyH.downPressed) {
                direction = "down";

                if (y >= (Main.HEIGHT / 2) + (25 - upIdle.getWidth()) * gp.scale) {
                    World.cameraOffsetY -= speed;
                } else {
                    y += speed;
                }


            } else {
                direction = "right";

                if (x >= (Main.WIDTH / 2) + 25 * gp.scale) {
                    World.cameraOffsetX -= speed;
                } else {
                    x += speed;
                }

            }

            spriteCounter++;
            if (spriteCounter >= gp.FPS / speed) {
                if (spriteNumber == 1) spriteNumber = 2;
                else if (spriteNumber == 2) spriteNumber = 1;

                spriteCounter = 0;
            }
        } else {
            // player is idling, test the direction
            switch (direction) {
                case "up" -> direction = "up-idle";
                case "down" -> direction = "down-idle";
                case "left" -> direction = "left-idle";
                case "right" -> direction = "right-idle";
            }
        }

    }

    public void draw(Graphics2D g2) {

        BufferedImage image = null;
        switch (direction.toLowerCase()) {
            case "up" -> {
                if (spriteNumber == 1) image = up1;
                if (spriteNumber == 2) image = up2;
            }
            case "down" -> {
                if (spriteNumber == 1) image = down1;
                if (spriteNumber == 2) image = down2;
            }
            case "left" -> {
                if (spriteNumber == 1) image = left1;
                if (spriteNumber == 2) image = left2;
            }
            case "right" -> {
                if (spriteNumber == 1) image = right1;
                if (spriteNumber == 2) image = right2;
            }
            case "up-idle" -> image = upIdle;
            case "down-idle" -> image = downIdle;
            case "left-idle" -> image = leftIdle;
            case "right-idle" -> image = rightIdle;

        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);

    }

}
