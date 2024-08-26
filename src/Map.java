abstract public class Map {
    abstract public Tile createTile();
    abstract String getRandomTileType();
    private char mapChar;
    public void display(){
        System.out.print(mapChar);
    };

}
