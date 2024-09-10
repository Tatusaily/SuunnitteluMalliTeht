package Tilebase.src;

public class BuildingTile implements Tile {
    private final char mapChar = 'B';
    private final String type = "Building";

    @Override
    public Character getCharacter() {
        return mapChar;
    }

    @Override
    public String getType() {
        return type;
    }
}
