package OrganizationStructure;

public class Employee extends Component {

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printData(int indent) {
        int salary = getSalary();
        String indentation = "│" + " ".repeat(indent * 2 - 1);
        System.out.printf(indentation + "<Employee name=\"%s\" salary=\"%d\"/>\n", name, salary);
    }

    @Override
    public int getSalary() {
        return (int) salary;
    }

}
