package Builder;

public interface ComputerBuilder {
    void buildMotherboard();
    void buildProcessor();
    void buildRam();
    void buildStorage();
    void buildGraphicsCard();
    void buildOperatingSystem();
    Computer getComputer();
}
