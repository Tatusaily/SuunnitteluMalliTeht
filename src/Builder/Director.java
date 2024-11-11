package Builder;

public class Director {
    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildMotherboard();
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildStorage();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
        return computerBuilder.getComputer();
    }
}
