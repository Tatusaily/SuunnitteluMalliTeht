package Builder;

public class MotherBoard {
    private final int ramSlots;
    private final int storageSlots;
    private final String name;

    public MotherBoard(int ramSlots, int storageSlots, String name) {
        this.ramSlots = ramSlots;
        this.storageSlots = storageSlots;
        this.name = name;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getStorageSlots() {
        return storageSlots;
    }

    public String getName() {
        return name;
    }

}
