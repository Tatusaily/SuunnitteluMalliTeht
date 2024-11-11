package Builder;

public class Computer {
    private String processor;
    private int[] ram;
    private int[] storage;
    private String graphicsCard;
    private MotherBoard motherboard;
    private String operatingSystem;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        // set ram to the first empty slot
        for (int i = 0; i < this.ram.length; i++) {
            if (this.ram[i] == 0) {
                this.ram[i] = ram;
                break;
            }
        }
    }

    public void setStorage(int storage) {
        // set storage to the first empty slot
        for (int i = 0; i < this.storage.length; i++) {
            if (this.storage[i] == 0) {
                this.storage[i] = storage;
                break;
            }
        }
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
        this.ram = new int[motherboard.getRamSlots()];
        this.storage = new int[motherboard.getStorageSlots()];
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRamSum() {
        int sum = 0;
        for (int i = 0; i < this.ram.length; i++) {
            sum += this.ram[i];
        }
        return sum;
    }

    public int getStorageSum() {
        int sum = 0;
        for (int i = 0; i < this.storage.length; i++) {
            sum += this.storage[i];
        }
        return sum;
    }

@Override
public String toString() {
    return "Computer{\n" +
            "processor='" + processor + '\'' + "\n" +
            "ram=" + getRamSum() + " GB\n" +
            "storage=" + getStorageSum() + " GB\n" +
            "graphicsCard='" + graphicsCard + '\'' + "\n" +
            "motherboard='" + motherboard.getName() + '\'' + "\n" +
            "operatingSystem='" + operatingSystem + '\'' + "\n" +
            '}';
}



}
