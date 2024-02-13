import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagmentSystem ems = new EmployeeManagmentSystem();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display all Employee");
            System.out.println("3. Update Employee salary");
            System.out.println("4. Update Employee Leave Date ");
            System.out.println("5. Remove Employee");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: 4. Update Employee Leave Date ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee name: Yeaniva Bayoh");
                    System.out.println("Enter employee name: Mariama Sesay");
                    System.out.println("Enter employee name: Micheal Kabia");
                    System.out.println("Enter employee name: John Cole");
                    System.out.println("Enter employee name: Haja Bah");
                    String name = scanner.next();

                    System.out.println("Enter Employee salary: 300");
                    System.out.println("Enter Employee salary: 600");
                    System.out.println("Enter Employee salary: 900");
                    System.out.println("Enter Employee salary: 700");
                    System.out.println("Enter Employee salary: 100");
                    double salary = scanner.nextDouble();
                    EmployeeManagmentSystem employeeManagmentSystem = null;
                    ems.addEmployee(name,salary);
                    break;

                case 2:
                    ems.displayAllEmployee();
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
                    ems.updateEmployeeSalary(idToUpdate,newSalary);
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
                    ems.updateEmployeeLeave(idToUpdateLeave, newLeaveDate);
                    break;

                case 5:
                    System.out.println("Enter employee Id to Remove: 4");
                    int idToRemove = scanner.nextInt();
                    ems.removeEmployee(idToRemove);
                    break;

                case 6:
                    System.out.println("Existing Employee Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");


            }
        }

    }
    }

