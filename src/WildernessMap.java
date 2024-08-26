import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildernessMap extends Map{
    private final ArrayList<String> tileTypes = new ArrayList<>(Arrays.asList("Swamp", "Water", "Forest"));
    @Override
    public Tile createTile() {
        String randomTileType = getRandomTileType();
        if (randomTileType.equals("Swamp")) {
            return new SwampTile();
        } else if (randomTileType.equals("Water")) {
            return new WaterTile();
        } else {
            return new ForestTile();
        }
    }

    @Override
    String getRandomTileType() {
        int randomIndex = (int) (Math.random() * tileTypes.size());
        return tileTypes.get(randomIndex);
    }
}
