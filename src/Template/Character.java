package Template;

public class Character {
    private String name;
    private int health, mana, strength, dexterity, intelligence;

    public Character(String name, String characterClass) {
        this.name = name;
        switch (characterClass) {
            case "Fighter":
                health = 100;
                mana = 10;
                strength = 10;
                dexterity = 5;
                intelligence = 0;
                break;
            case "Wizard":
                health = 50;
                mana = 100;
                strength = 2;
                dexterity = 5;
                intelligence = 10;
                break;
            default:
                throw new IllegalArgumentException("Invalid character class: " + characterClass);
        }
    }

    // Getters and setters for all
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

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
    }
}