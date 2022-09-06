package tile;

import io.Converter;
import io.GridTile;
import io.LayerInstance;
import io.LevelData;
import main.GamePanel;
import org.jetbrains.annotations.NotNull;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

//import io.Converter;

public class TileManager {

    final GamePanel gp;

    public static LevelData data;
    public static boolean cached = false;

    private ArrayList<BufferedImage> image;
    private ArrayList<Tile> tiles;
    private ArrayList<LayerInstance> layerInstances;
    private int layerInstanceLength;


    public TileManager(GamePanel gp) {

        this.gp = gp;
    }

    public void draw(Graphics2D g2, String src) throws IOException {
        if (cached) {
            drawMap(g2);
        } else {
            loadMap(g2, src);
            cached = true;
        }
    }


    private void drawMap(Graphics2D g2) {
        int maxJ = 0;
        for (int i = 0; i < layerInstanceLength; i++) {

            LayerInstance li = layerInstances.get(i);

            for (int j = 0; j < li.getGridTiles().length; j++) {

                createCroppedImage(g2, maxJ, i);
                maxJ++;
            }
        }
    }

    private void loadMap(Graphics2D g2, String src) throws IOException {

        String content;

        InputStream is = TileManager.class.getResourceAsStream(src);

        assert is != null;
        content = new BufferedReader(new InputStreamReader(is))
                .lines().collect(Collectors.joining("\n"));

        data = Converter.fromJsonString(content);

        tiles = new ArrayList<>();
        layerInstances = new ArrayList<>();
        image = new ArrayList<>();
        ArrayList<String> tilesetRelPath = new ArrayList<>();

        layerInstanceLength = data.getLayerInstances().length;

        int maxJ = 0;
        for (int i = 0; i < layerInstanceLength; i++) {

            int RI = data.getLayerInstances().length - (i + 1);
            LayerInstance li = data.getLayerInstances()[RI];
            layerInstances.add(li);


            tilesetRelPath.add("/" + li.getTilesetRelPath());
            image.add(ImageIO.read(
                    Objects.requireNonNull(getClass().getResourceAsStream(tilesetRelPath.get(i)))));

            for (int j = 0; j < li.getGridTiles().length; j++) {

                GridTile gt = li.getGridTiles()[j];

                tiles.add(new Tile());
                tiles.get(maxJ).imageCord = gt.getPx();
                tiles.get(maxJ).cord = gt.getSrc();

                maxJ++;
            }
        }

        drawMap(g2);
    }

    private void createCroppedImage(@NotNull Graphics2D g2, int maxJ, int i) {
        BufferedImage croppedImage = cropImage(image.get(i),
                                               new Rectangle(tiles.get(maxJ).cord[0], tiles.get(maxJ).cord[1], 16, 16));

        g2.drawImage(croppedImage, tiles.get(maxJ).imageCord[0] * gp.scale,
                     tiles.get(maxJ).imageCord[1] * gp.scale,
                     gp.tileSize, gp.tileSize,
                     null);
    }

    private BufferedImage cropImage(@NotNull BufferedImage src, @NotNull Rectangle rect) {
        return src.getSubimage(rect.x, rect.y, rect.width, rect.height);
    }


}

