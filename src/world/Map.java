package world;

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

public class Map {

    final GamePanel gp;

    public static LevelData data;
    public static boolean cached = false;

    private final ArrayList<MapLayer> mapLayerInstances = new ArrayList<>();
    private final String src;
    public final int worldOffsetX;
    public final int worldOffsetY;


    public Map(GamePanel gp, String src, int worldOffsetX, int worldOffsetY) {

        this.gp = gp;
        this.src = src;
        this.worldOffsetX = worldOffsetX;
        this.worldOffsetY = worldOffsetY;
    }

    public void draw(Graphics2D g2) throws IOException {
        if (cached) {
            drawMap(g2);
        } else {
            loadMap(g2, this.src);
            cached = true;
        }
    }


    private void drawMap(Graphics2D g2) {

        for (MapLayer mapLayer : mapLayerInstances) {
            mapLayer.drawLayer(g2, worldOffsetX, worldOffsetY);
        }
    }

    private void loadMap(Graphics2D g2, String src) throws IOException {

        String content;

        InputStream is = Map.class.getResourceAsStream(src);

        assert is != null;
        content = new BufferedReader(new InputStreamReader(is))
                .lines().collect(Collectors.joining("\n"));

        data = Converter.fromJsonString(content);

        int layerInstanceLength = data.getLayerInstances().length;

        for (int i = 0; i < layerInstanceLength; i++) {

            int RI = data.getLayerInstances().length - (i + 1);
            LayerInstance li = data.getLayerInstances()[RI];
            mapLayerInstances.add(new MapLayer(li, ImageIO.read(
                    Objects.requireNonNull(getClass().getResourceAsStream("/" + li.getTilesetRelPath())))));

            mapLayerInstances.get(i).loadTiles(gp);

        }

        is.close();
        drawMap(g2);
    }

}
