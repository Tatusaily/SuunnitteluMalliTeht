package Builder;

public class Director {
    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildStorage();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildMotherboard();
        computerBuilder.buildOperatingSystem();
        return computerBuilder.getComputer();
    }
}
