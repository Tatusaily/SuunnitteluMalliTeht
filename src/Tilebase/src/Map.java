package Tilebase.src;

import java.util.ArrayList;

abstract public class Map {
    abstract public Tile createTile();

    abstract String getRandomTileType();

    private final ArrayList<Tile> tileArray = new ArrayList<>();

    int y = 10;
    int x = 10;

    public void generateTileArray() {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                Tile tile = createTile();
                tileArray.add(tile);
            }
        }
    }

    public void display() {
        generateTileArray();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(tileArray.get(i * x + j).getCharacter());
            }
            System.out.println();
        }
    }

}
