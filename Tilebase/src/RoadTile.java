package Tilebase.src;

public class RoadTile implements Tile {
    private final char mapChar = 'R';
    private final String type = "Road";

    @Override
    public Character getCharacter() {
        return mapChar;
    }

    @Override
    public String getType() {
        return type;
    }
}
