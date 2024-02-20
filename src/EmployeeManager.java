import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    private List<Employee> employeeList;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
    }
    public void addMoreEmployee1 () {

        Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            System.out.println("Enter ID: ");
            int id = scanner.nextInt();

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            name = scanner.nextLine();
            System.out.println("Enter Address");
            String address = scanner.nextLine();

            Employee employee = new Employee(id, name, address);
            employeeList.add(employee);
            System.out.println("Employee added successfully!");

            System.out.println("Add Another another employee? (y/n): ");
            choice = scanner.nextLine().toLowerCase();
        } while (choice.equals("y"));
    }

    public Employee findEmployee(String searchParameter) {
        for (Employee employee : employeeList) {
            // Implement search logic based on searchParameter (e.g., compare name, ID)
            if (employee.getId() != 0) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(Employee employee) {
        if (employee != null) {
            employeeList.remove(employee);
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }


    public void updateEmployee(Employee employee) {
        if (employee != null) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Which information do you want to update? (name, ID, department)");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "name":
                    System.out.print("Enter new name: ");
                    employee.setName(scanner.nextLine());
                    break;
                // Implement cases for other attributes and handle user input
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }
    public void displayEmployees() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose how you want to format the list:");
        System.out.println("1. By name (ascending)");
        System.out.println("2. By name (descending)");
        System.out.println("3. No sorting, simple format");
        int choice = scanner.nextInt();

        // Implement sorting logic based on choice (if applicable)

        System.out.println("\nEmployees:");
        for (Employee employee : employeeList) {
            // Format output based on user choice
            if (choice == 1) {
                System.out.println(employee.getName() + " (ascending)");
            } else if (choice == 2) {
                System.out.println(employee.getName() + " (descending)");
            } else {
                System.out.println(employee.toString()); // Assuming toString is overridden
            }
        }
    }
}
