package State;

public class MasterState extends State {
    public MasterState(Character character) {
        super(character);
    }

    @Override
    public void train() {
        System.out.println("You are a Master. No need to train.");
    }

    @Override
    public void meditate() {
        System.out.println("You are a Master. No need to meditate.");
    }

    @Override
    public void fight() {
        System.out.println("You are a Master. No need to fight.");
    }

    @Override
    public void levelUp() {
        System.out.println("You are at the highest level!");
    }
}