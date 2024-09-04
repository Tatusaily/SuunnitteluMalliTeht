package OrganizationStructure;

public class Employee extends Component{

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printData() {
        System.out.println(name + " " + salary + "€");
    }

}
