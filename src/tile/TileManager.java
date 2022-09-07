package tile;

import io.Converter;
import io.LayerInstance;
import io.LevelData;
import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
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

    private final ArrayList<Layer> layerInstances = new ArrayList<>();


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

        for (Layer layer :
                layerInstances) {
            layer.drawLayer(g2);
        }
    }

    private void loadMap(Graphics2D g2, String src) throws IOException {

        String content;

        InputStream is = TileManager.class.getResourceAsStream(src);

        assert is != null;
        content = new BufferedReader(new InputStreamReader(is))
                .lines().collect(Collectors.joining("\n"));

        data = Converter.fromJsonString(content);

        int layerInstanceLength = data.getLayerInstances().length;

        for (int i = 0; i < layerInstanceLength; i++) {

            int RI = data.getLayerInstances().length - (i + 1);
            LayerInstance li = data.getLayerInstances()[RI];
            layerInstances.add(new Layer(li, ImageIO.read(
                    Objects.requireNonNull(getClass().getResourceAsStream("/" + li.getTilesetRelPath())))));

            layerInstances.get(i).loadTiles(gp);

        }

        drawMap(g2);
    }

}

