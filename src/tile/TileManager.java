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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

//import io.Converter;

public class TileManager {

    final GamePanel gp;
    final Tile[] tile;

    public static LevelData data;
    public static boolean cached = false;

    private ArrayList<BufferedImage> image;
    private ArrayList<Integer> x1;
    private ArrayList<Integer> x2;
    private ArrayList<Integer> y1;
    private ArrayList<Integer> y2;


    public TileManager(GamePanel gp) throws IOException {
        this.gp = gp;
        String content;

        tile = new Tile[10];
        getTileImage();

        String scr = "src/res/map/Level_0.ldtkl";
        // default StandardCharsets.UTF_8
        content = Files.readString(Paths.get(scr));
        data = Converter.fromJsonString(content);
    }

    public void getTileImage() {

        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/tiles/grass.png")));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/tiles/bush.png")));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/tiles/water.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void draw(Graphics2D g2, LevelData data) {

        int maxJ;
        if (!cached) {

            try {

                maxJ = 0;
                x1 = new ArrayList<>();
                y1 = new ArrayList<>();
                x2 = new ArrayList<>();
                y2 = new ArrayList<>();

                image = new ArrayList<>();
                ArrayList<String> tilesetRelPath = new ArrayList<>();

                for (int i = 0; i < data.getLayerInstances().length; i++) {

                    LayerInstance li = data.getLayerInstances()[i];


                    tilesetRelPath.add("/" + li.getTilesetRelPath());
                    image.add(ImageIO.read(
                            Objects.requireNonNull(getClass().getResourceAsStream(tilesetRelPath.get(i)))));

                    for (int j = 0; j < li.getGridTiles().length; j++) {

                        GridTile gt = li.getGridTiles()[j];

                        System.out.println(li.getGridTiles().length);

                        x1.add((int) gt.getPx()[0]);
                        y1.add((int) gt.getPx()[1]);
                        x2.add((int) gt.getSrc()[0]);
                        y2.add((int) gt.getSrc()[1]);

                        createCroppedImage(g2, maxJ, i);
                        maxJ++;
                    }
                }

                cached = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (cached) {
            maxJ = 0;
            for (int i = 0; i < data.getLayerInstances().length; i++) {

                LayerInstance li = data.getLayerInstances()[i];

                for (int j = 0; j < li.getGridTiles().length; j++) {

                    createCroppedImage(g2, maxJ, i);
                    maxJ++;
                }
            }
        }
    }

    private void createCroppedImage(@NotNull Graphics2D g2, int maxJ, int i) {
        BufferedImage croppedImage = cropImage(image.get(i),
                                               new Rectangle(x2.get(maxJ), y2.get(maxJ), 16, 16));

        g2.drawImage(croppedImage, x1.get(maxJ) * gp.scale,
                     y1.get(maxJ) * gp.scale,
                     gp.tileSize, gp.tileSize,
                     null);
    }

    private BufferedImage cropImage(@NotNull BufferedImage src, @NotNull Rectangle rect) {
        return src.getSubimage(rect.x, rect.y, rect.width, rect.height);
    }


}

