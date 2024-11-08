package Builder;

public class OfficeComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public OfficeComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core i5");
    }

    @Override
    public void buildRam() {
        computer.setRam(8);
        computer.setRam(8);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(256);
        computer.setStorage(256);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Nvidia GeForce GTX 970");
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard(new MotherBoard(4, 2, "Asus Prime"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows XP Professional");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
