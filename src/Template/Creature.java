package Template;

import java.util.HashMap;
import java.util.Map;

public class Creature {
    private String name;
    private int health, mana, strength, dexterity, intelligence;

    private static final Map<String, int[]> creatureData = new HashMap<>();

    static {
        creatureData.put("Goblin", new int[]{30, 0, 5, 7, 2});
        creatureData.put("Orc", new int[]{80, 0, 12, 4, 3});
        creatureData.put("Troll", new int[]{120, 0, 15, 3, 1});
        creatureData.put("Dragon", new int[]{200, 50, 20, 10, 15});
        creatureData.put("Skeleton", new int[]{20, 0, 3, 5, 1});
    }

    public Creature(String name, String creatureType) {
        this.name = name;
        int[] data = creatureData.get(creatureType);
        if (data != null) {
            this.health = data[0];
            this.mana = data[1];
            this.strength = data[2];
            this.dexterity = data[3];
            this.intelligence = data[4];
        } else {
            throw new IllegalArgumentException("Invalid creature type: " + creatureType);
        }
    }

    public Creature getCreature(String name, String creatureType) {
        return new Creature(name, creatureType);
    }

    public static Creature getRandomCreature(String name) {
        String[] creatureTypes = creatureData.keySet().toArray(new String[0]);
        int randomIndex = (int) (Math.random() * creatureTypes.length);
        return new Creature(name, creatureTypes[randomIndex]);
    }

    public int getTotalStats() {
        return health + mana + strength + dexterity + intelligence;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }



}