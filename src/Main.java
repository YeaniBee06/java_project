import java.util.Scanner;

public class Main {

    class EmployeeManagementSystem {
        
    }
    public static <EmployeeManagmentSystem> void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagmentSystem ems;
        ems = null;


        boolean input = true;

//        while (input) {
//            DisplayString();
//            switch (Integer.parseInt(scanner.nextLine())) {
//                case 1 -> Test.addEmployee(scanner);
//                case 2 -> Test.removeEmployee();
//                case 3 -> Test.updateEmployeeSalary();
//                case 4 -> Test.updateEmployeeLeave();
//                case 5 -> Test.displayAllEmployee(scanner);
//                default -> input = false;
//            }

            while (true) {
                System.out.println("\nEmployee Management System");
                System.out.println("1. Add Employee");
                System.out.println("2. Display all Employee");
                System.out.println("3. Update Employee salary");
                System.out.println("4. Update Employee Leave Date ");
                System.out.println("5. Remove Employee");
                System.out .println("6. Exit");
                System.out.println("Enter your choice: - ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter employee name: ");
                        System.out.println("Enter employee name: ");
                        System.out.println("Enter employee name: ");
                        System.out.println("Enter employee name: ");
                        System.out.println("Enter employee name: ");
                        String name = scanner.next();

                        System.out.println("Enter Employee salary: 300");
                        System.out.println("Enter Employee salary: 600");
                        System.out.println("Enter Employee salary: 900");
                        System.out.println("Enter Employee salary: 700");
                        System.out.println("Enter Employee salary: 100");
                        double salary = scanner.nextDouble();
                        EmployeeManagmentSystem employeeManagmentSystem = null;
                        Object clone = ems;
                                

                    case 2:
                        ems.notify();
                        break;

                    case 3:
                        System.out.println("Enter employee Id: 1");
                        System.out.println("Enter employee Id: 2");
                        System.out.println("Enter employee Id: 3");
                        System.out.println("Enter employee Id: 4");
                        System.out.println("Enter employee Id: 5");
                        int idToUpdate = scanner.nextInt();

                        System.out.println("Enter new salary: 200.50");
                        System.out.println("Enter new salary: 600.80");
                        System.out.println("Enter new salary: 900.10");
                        System.out.println("Enter new salary: 800.99");
                        System.out.println("Enter new salary: 500.40");
                        double newSalary = scanner.nextDouble();
                        ems.notifyAll();
                        break;
                    case 4:
                        System.out.println("Enter employee Id: 1, 2, 3, 4, 5");
                        int idToUpdateLeave = scanner.nextInt();
                        System.out.println("Enter Leave new Leave date (YYYY-MM-DD: 2022-06-05 ");
                        System.out.println("Enter Leave new Leave date (YYYY-MM-DD: 2023-09-20 ");
                        System.out.println("Enter Leave new Leave date (YYYY-MM-DD: 2022-10-05 ");
                        System.out.println("Enter Leave new Leave date (YYYY-MM-DD: 2023-01-29 ");
                        System.out.println("Enter Leave new Leave date (YYYY-MM-DD: 2022-07-30 ");
                        String newLeaveDate = scanner.next();
                        break;

                    case 5:
                        System.out.println("Enter employee Id to Remove: 4");
                        int idToRemove = scanner.nextInt();
                        ems.notify();
                        break;

                    case 6:
                        System.out.println("Existing Employee Management System. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");


                }
            }

        }


    private static void DisplayString() {
    }
}

