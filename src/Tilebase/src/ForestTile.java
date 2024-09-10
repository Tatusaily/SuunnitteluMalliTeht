package Tilebase.src;

public class ForestTile implements Tile {
    private final char mapChar = 'F';
    private final String type = "Forest";

    @Override
    public Character getCharacter() {
        return mapChar;
    }

    @Override
    public String getType() {
        return type;
    }
}
