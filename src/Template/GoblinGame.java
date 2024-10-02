package Template;

import java.util.Scanner;

public class GoblinGame extends Game {

    private boolean gameStarted = false;
    private boolean gameEnd = false;
    private Creature currentCreature;
    private Character playerCharacter;
    private int score = 0;


    @Override
    public void initializeGame(int numberOfPlayers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Goblin Game!");

        // Character creation
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        System.out.print("Choose your class (Fighter/Wizard): ");
        String characterClass = scanner.nextLine();

        playerCharacter = new Character(name, characterClass);
        gameStarted = true;
    }

    @Override
    public boolean endOfGame() {
        return gameEnd;
    }

    @Override
    public void playSingleTurn(int player) {
        if (!gameStarted) {
            System.out.println("Game has not started yet.");
            return;
        }

        if (currentCreature == null) {
            currentCreature = Creature.getRandomCreature("Goblin");
            System.out.println("NEW COMBAT: " + playerCharacter.getName() + " vs " + currentCreature.getName());
            numberOfPlayers++; // Increase the number of players when a new creature appears
        }

        // IF player = 0, player is the character else, it is a creature's turn.
        if (player == 0) {
            playerTurn();
        } else {
            creatureTurn();
        }

        if (currentCreature.getHealth() <= 0) {
            System.out.println(currentCreature.getName() + " has perished!");
            score += currentCreature.getTotalStats();
            currentCreature = null;
            numberOfPlayers--; // Reduce the number of players when a creature perishes
        }

        // Check if the player perishes (this is a simple example, you can expand it)
        if (playerCharacter.getHealth() <= 0) {
            System.out.println(playerCharacter.getName() + " has perished! Game Over.");
            gameEnd = true;
        }
    }

    @Override
    public void displayWinner() {
        System.out.println("Goblin Game finished. Your score: " + score);
    }

    private void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        boolean turnOver = false;
        while (!turnOver) {
            System.out.printf("""
                    HEALTH: %d | MANA: %d
                    Choose your action:
                    1. Attack
                    2. Cast spell
                    %n""", playerCharacter.getHealth(), playerCharacter.getMana());
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    int damage = playerCharacter.getStrength()+1;
                    System.out.println(playerCharacter.getName() + " attacks " + currentCreature.getName() + " for " + damage + " damage.");
                    currentCreature.setHealth(currentCreature.getHealth() - damage);
                    turnOver = true;
                    break;
                case 2:
                    if (playerCharacter.getMana() < 1) {
                        System.out.println("Not enough mana.");
                        break;
                    }
                    System.out.println("Would you like to cast a Fireball, or Heal?");
                    String spell = scanner.next();
                    switch (spell){
                        case "Fireball":
                            if (playerCharacter.getMana() >= 5) {
                                System.out.println("Not enough mana.");
                                break;
                            }
                            damage = playerCharacter.getIntelligence()+5;
                            System.out.println(playerCharacter.getName() + " casts Fireball on " + currentCreature.getName() + " for " + damage + " damage.");
                            currentCreature.setHealth(currentCreature.getHealth() - damage);
                            playerCharacter.setMana(playerCharacter.getMana() - 5);
                            turnOver = true;
                            break;
                        case "Heal":
                            if (playerCharacter.getMana() < 3) {
                                System.out.println("Not enough mana.");
                                break;
                            }
                            int heal = playerCharacter.getIntelligence()+3;
                            System.out.println(playerCharacter.getName() + " casts Heal on themselves for " + heal + " health.");
                            playerCharacter.setHealth(playerCharacter.getHealth() + heal);
                            playerCharacter.setMana(playerCharacter.getMana() - 3);
                            turnOver = true;
                            break;
                        default:
                            System.out.println("Invalid spell.");
                    }
                    break;
                default:
                    System.out.println("Invalid action.");
            }
        }

    }

    private void creatureTurn() {
        int damage = currentCreature.getStrength();
        System.out.println(currentCreature.getName() + " attacks " + playerCharacter.getName() + " for " + damage + " damage.");
        playerCharacter.setHealth(playerCharacter.getHealth() - damage);
    }

}