package OrganizationStructure;

import java.util.ArrayList;

public class Department extends Component{

    public ArrayList<Component> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printData() {
        System.out.println(name);
        for (Component child : children) {
            child.printData();
        }
    }

    public void addChild(Component child) {
        children.add(child);
    }

    public void removeChild(Component child) {
        children.remove(child);
    }


}
