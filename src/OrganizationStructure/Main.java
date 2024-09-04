package OrganizationStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create the departments
        ArrayList<Department> departments = new ArrayList<>();
        Department Sales = new Department("Sales");
        Department Development = new Department("Development");
        Department Marketing = new Department("Marketing");
        Department Management = new Department("Management");
        Management.addChild(Marketing);
        departments.add(Sales);
        departments.add(Development);
        departments.add(Management);
        departments.add(Marketing);
        Department Organization = new Department("Organization");
        Organization.addChild(Sales);
        Organization.addChild(Development);
        Organization.addChild(Management);

        // Read the CSV file for employee names
        ArrayList<String> employeeNames = csvToList("./src/OrganizationStructure/NameList.csv");

        // Create the employees
        List<Employee> employees = new ArrayList<>();
        int numberOfEmployees = 10;
        for (int i = 0; i < numberOfEmployees; i++) {
            double randomSalary = Math.random() * 1000;
            randomSalary = Math.round(randomSalary);

            Employee employee = new Employee(employeeNames.get(i), randomSalary);
            employees.add(employee);
        }

        // Add the employees randomly to the departments
        for (int i = 0; i < numberOfEmployees; i++) {
            int randomDepartmentIndex = (int) (Math.random() * departments.size());
            Department randomDepartment = departments.get(randomDepartmentIndex);
            randomDepartment.addChild(employees.get(i));
        }


        // Print the organization structure
        Organization.printData();
    }

    public static ArrayList<String> csvToList(String csvFile) {
        ArrayList<String> employeeNames = new ArrayList<>();

        // Read the CSV file for employee names
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Split the line by comma
                String[] employeeData = line.split(csvSplitBy);

                // Get the employee name
                String employeeName = employeeData[0];

                // Add the employee to the department
                employeeNames.add(employeeName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employeeNames;
    }
}
