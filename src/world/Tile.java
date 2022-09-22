package world;

import main.GamePanel;
import main.Main;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    private final GamePanel gp;
    public int[] imageCord = new int[2];
    public int[] cord = new int[2];

    public boolean collision = false;
    public static Graphics2D g2;

    private BufferedImage croppedImage;
    public static int a = 0;

    public void draw(BufferedImage src, int worldOffsetX, int worldOffsetY, int cameraOffsetX, int cameraOffsetY) {

        drawCroppedImage(g2, src, worldOffsetX, worldOffsetY, cameraOffsetX, cameraOffsetY);
    }

    private void drawCroppedImage(@NotNull Graphics2D g2, BufferedImage src, int worldOffsetX, int worldOffsetY,
                                  int cameraOffsetX, int cameraOffsetY) {
        if (croppedImage == null) {
            croppedImage = cropImage(src, new Rectangle(this.cord[0], this.cord[1], 16, 16));
        }
        if ((this.imageCord[0] + worldOffsetX) * gp.scale + cameraOffsetX + Main.EXTRA_TILES_X * gp.tileSize > 0 &&
                (this.imageCord[0] + worldOffsetX) * gp.scale + cameraOffsetX - Main.EXTRA_TILES_X * gp.tileSize < gp.screenWidth &&
                (this.imageCord[1] + worldOffsetY) * gp.scale + cameraOffsetY + Main.EXTRA_TILES_Y * gp.tileSize > 0 &&
                (this.imageCord[1] + worldOffsetY) * gp.scale + cameraOffsetY - Main.EXTRA_TILES_Y * gp.tileSize < gp.screenHeight) {

            g2.drawImage(croppedImage, ((this.imageCord[0] + worldOffsetX) * gp.scale) + cameraOffsetX,
                         ((this.imageCord[1] + worldOffsetY) * gp.scale) + cameraOffsetY,
                         gp.tileSize, gp.tileSize,
                         null);

            System.out.println();
            System.out.println("CORD.X: " + this.imageCord[0]);
            System.out.println("CORD.Y: " + this.imageCord[1]);
            System.out.println();

            a++;
        }

    }

    private BufferedImage cropImage(@NotNull BufferedImage src, @NotNull Rectangle rect) {
        return src.getSubimage(rect.x, rect.y, rect.width, rect.height);
    }

    public Tile(GamePanel gp, int[] px) {

        this.gp = gp;
        imageCord[0] = px[0];
        imageCord[1] = px[1];
    }

}
