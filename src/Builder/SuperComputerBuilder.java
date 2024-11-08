package Builder;

public class SuperComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public SuperComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard(new MotherBoard(4, 4, "Super Motherboard"));
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Super Processor 10000");
    }

    @Override
    public void buildRam() {
        computer.setRam(32);
        computer.setRam(32);
        computer.setRam(32);
        computer.setRam(32);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(512);
        computer.setStorage(512);
        computer.setStorage(512);
        computer.setStorage(512);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("2x Super Graphics Card");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Super Windows 10");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
