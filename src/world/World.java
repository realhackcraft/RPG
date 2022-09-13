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

    public static void load(GamePanel gp, Graphics2D g2, String path) throws IOException {
        if (!cached) {

            try {
                InputStream is = World.class.getResourceAsStream(path);

                assert is != null;
                String content = new BufferedReader(new InputStreamReader(is))
                        .lines().collect(Collectors.joining("\n"));

                LevelData data = Converter.fromJsonString(content);

                for (Level data1 : data.getLevels()) {

                    String externalRelPath = "/" + data1.getExternalRelPath();
                    int worldOffsetX = data1.getWorldX();
                    int worldOffsetY = data1.getWorldY();
                    maps.add(new Map(gp, externalRelPath, worldOffsetX, worldOffsetY));
                }
                is.close();
                cached = true;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        draw(g2);

    }

    public static void draw(Graphics2D g2) throws IOException {

        for (Map map : maps) {

            map.draw(g2);
        }
    }

}

