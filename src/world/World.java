package world;

import level.Converter;
import level.Level;
import level.LevelData;
import main.GamePanel;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class World {

    static ArrayList<Map> maps = new ArrayList<>();

    static boolean cached = false;
    public static Graphics2D g2;

    public static int cameraOffsetX = 0;
    public static int cameraOffsetY = 0;

    public static void load(GamePanel gp, String path) throws IOException {

        if (!cached) {

            InputStream is = World.class.getResourceAsStream(path);

            assert is != null;
            String content = new BufferedReader(new InputStreamReader(is))
                    .lines().collect(Collectors.joining("\n"));
            is.close();

            LevelData data = Converter.fromJsonString(content);

            for (Level data1 : data.getLevels()) {

                String externalRelPath = "/" + data1.getExternalRelPath();
                int worldOffsetX = data1.getWorldX();
                int worldOffsetY = data1.getWorldY();
                maps.add(new Map(gp, externalRelPath, worldOffsetX, worldOffsetY));
            }
            cached = true;

            gp.setBackground(Color.decode(data.getBgColor()));

        }

        draw();

    }

    public static void draw() throws IOException {

        for (Map map : maps) {

            map.draw(cameraOffsetX, cameraOffsetY);
        }
    }

}

