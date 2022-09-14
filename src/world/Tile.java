package world;

import main.GamePanel;
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

    public void draw(BufferedImage src, int worldOffsetX, int worldOffsetY) {

        drawCroppedImage(g2, src, worldOffsetX, worldOffsetY);
    }

    private void drawCroppedImage(@NotNull Graphics2D g2, BufferedImage src, int worldOffsetX, int worldOffsetY) {
        if (croppedImage == null) {
            croppedImage = cropImage(src, new Rectangle(this.cord[0], this.cord[1], 16, 16));
        }

        g2.drawImage(croppedImage, (this.imageCord[0] + worldOffsetX) * gp.scale,
                     (this.imageCord[1] + worldOffsetY) * gp.scale,
                     gp.tileSize, gp.tileSize,
                     null);
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
