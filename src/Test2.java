import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

//        manager.addMoreEmployee1();
//
//        manager.displayEmployees();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter search parameter (name, ID, etc.): ");
        String searchParameter = scanner.nextLine();

        Employee employee = manager.findEmployee(searchParameter);
        manager.removeEmployee(employee);

        manager.updateEmployee(employee);

        boolean input = true;
        while (input) {
                displayOptions();
            switch (Integer.parseInt(scanner.nextLine())) {
                    case 1 -> manager.addMoreEmployee1();
                    case 2 -> manager.updateEmployee(employee);
                    case 3 -> manager.displayEmployees();
                    case 4 -> manager.removeEmployee(employee);
                    case 5 -> manager.findEmployee(searchParameter);
                    default -> input = false;
                }
            }


//       EmployeeManager manager = new EmployeeManager();
//       manager.addMoreEmployee1();
//
//       manager.displayEmployees();
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter search parameter (name, ID, etc.): ");
//        String searchParameter = scanner.nextLine();
//
//        Employee employee = manager.findEmployee(searchParameter);
//        manager.removeEmployee(employee);
//
//        manager.updateEmployee(employee);


    }

    public static void displayOptions () {
            System.out.println("Enter any value from 1 - 6");

            System.out.println("""

                    1. Add Employee
                    2. Update Employee
                    3. Display All Employee
                    4. Remove Employee
                    5. Find or Search For All Employee
                    6. Quit program
                    Print options""");
        }
}
