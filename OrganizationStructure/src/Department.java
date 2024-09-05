package OrganizationStructure.src;

import java.util.ArrayList;

public class Department extends Component {

    public ArrayList<Component> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printData(int indent) {
        int salary = getSalary();
        String indentation = "─".repeat(indent * 2);
        if (indent > 0) {
            indentation = "│" + indentation;
        }
        System.out.printf(indentation + "<Department name=\"%s\" salary=\"%d\">\n", name, salary);
        for (Component child : children) {
            child.printData(indent + 1);
        }
        System.out.println("│" + " ".repeat(indent * 2) + "</Department>");
    }

    @Override
    public int getSalary() {
        int totalSalary = 0;
        for (Component child : children) {
            totalSalary += child.getSalary();
        }
        return totalSalary;
    }

    public void addChild(Component child) {
        children.add(child);
    }

    public void removeChild(Component child) {
        children.remove(child);
    }

}
