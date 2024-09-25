package Tilebase.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityMap extends Map {
    private final List<String> tileTypes = new ArrayList<>(Arrays.asList("Road", "Forest", "Building"));

    @Override
    public Tile createTile() {
        String randomTileType = getRandomTileType();
        if (randomTileType.equals("Road")) {
            return new RoadTile();
        } else if (randomTileType.equals("Forest")) {
            return new ForestTile();
        } else {
            return new BuildingTile();
        }
    }

    @Override
    String getRandomTileType() {
        int randomIndex = (int) (Math.random() * tileTypes.size());
        return tileTypes.get(randomIndex);
    }
}
