package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder computerBuilder = new SuperComputerBuilder();
        //ComputerBuilder computerBuilder = new OfficeComputerBuilder();
        Computer computer = director.constructComputer(computerBuilder);

        System.out.println(computer);

    }
}
