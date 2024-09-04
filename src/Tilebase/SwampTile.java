public class SwampTile implements Tile{
    private final char mapChar = 'S';
    private final String type = "Swamp";
    @Override
    public Character getCharacter() {
        return mapChar;
    }
    @Override
    public String getType() {
        return type;
    }
}
