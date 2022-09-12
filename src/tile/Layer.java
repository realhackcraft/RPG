package tile;

import io.GridTile;
import io.LayerInstance;
import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Layer {

    private final LayerInstance li;
    private final BufferedImage tilesetImage;
    public ArrayList<Tile> tiles = new ArrayList<>();

    public void drawLayer(Graphics2D g2) {

        for (Tile tile : tiles) {
            tile.draw(tilesetImage, g2);
        }
    }

    public Layer(LayerInstance li, BufferedImage tilesetImage) {

        this.li = li;
        this.tilesetImage = tilesetImage;
    }

    public void loadTiles(GamePanel gp) {

        int maxI = 0;
        for (int i = 0; i < li.getGridTiles().length; i++) {

            GridTile gt = li.getGridTiles()[i];

            tiles.add(new Tile(gp, gt.getPx()));
            tiles.get(maxI).cord = gt.getSrc();

            maxI++;
        }
    }

}
