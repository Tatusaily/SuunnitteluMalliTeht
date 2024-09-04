public class WaterTile implements Tile{
    private final char mapChar = 'W';
    private final String type = "Water";
    @Override
    public Character getCharacter() {
        return mapChar;
    }
    @Override
    public String getType() {
        return type;
    }

}
