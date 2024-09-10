package Tilebase.src;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select a map type:
                1. City
                2. Wilderness""");
        int selection = sc.nextInt();
        Map map;
        if (selection == 1) {
            map = new CityMap();
        } else if (selection == 2) {
            map = new WildernessMap();
        } else {
            System.out.println("Invalid selection");
            return;
        }
        map.display();
    }
}
