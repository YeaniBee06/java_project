import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
//    static Scanner scan = new Scanner(System.in);

//    public static Employee main(String[] args) {


//        ArrayList<Employee> employees = new ArrayList<>();
//
//        Scanner scanner = new Scanner(System.in);
//
////        System.out.println("Enter name: ");
////        String name = scanner.nextLine();
////
////        System.out.println("Enter ID: ");
////        int id = scanner.nextInt();
////
////        System.out.println("Enter Address");
////        String address = scanner.nextLine();
////
////        Employee employee = new Employee(id, name, address);
////        employees.add(employee);
//
//        while (true) {
//            System.out.println("Enter employee details (ID, name, address) or 'q' to quit:");
//            String input = scanner.nextLine();
//
//            if (input.equalsIgnoreCase("q")) {
//                break;
//            }
//        }
//
//
//        EmployeeManagmentSystem ems = new EmployeeManagmentSystem();
//
//        boolean input = true;
//        boolean running = false;
//        Scanner scanner;
//        while (running) {
//            System.out.println("Employee Management System");
//            System.out.println("1. Add Employee");
//            System.out.println("2. View Employees");
//            System.out.println("3. Update Employee Department");
//            System.out.println("4. Delete Employee");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            scanner = null;
//            int choice = scanner.nextInt();
////            scanner.nextLine(); // Consume the newline character
////
////            switch (choice) {
////                case 1:
////                    addEmployee(scanner);
////                    break;
////                case 2:
////                    viewEmployees();
////                    break;
////                case 3:
////                    updateEmployeeDepartment(scanner);
////                    break;
////                case 4:
////                    deleteEmployee(scanner);
////                    break;
////                case 5:
////                    running = false;
////                    break;
////                default:
////                    System.out.println("Invalid choice. Please try again.");
////            }
//
//            while (input) {
//                displayOptions();
//                switch (Integer.parseInt(scan.nextLine())) {
//                    case 1 -> ems.addEmployee();
//                    case 2 -> ems.removeEmployee();
//                    case 3 -> ems.updateEmployeeSalary();
//                    case 4 -> ems.updateEmployeeLeave();
//                    case 5 -> ems.displayAllEmployee();
//                    default -> input = false;
//                }
//            }
//
//        }
//
//        private static void deleteEmployee (Scanner scanner){
//        }
//
//        private static void updateEmployeeDepartment (Scanner scanner){
//        }
//
//        private static void viewEmployees () {
//        }
//
//        scanner
//        static void updateEmployeeSalary () {
//        }=
//
//        public static void addEmployee (Scanner scanner){
//
//            ArrayList<String> employee = new ArrayList<>();
//
//            System.out.println("Enter elements (type 'done' to finish):");
//
//            while (true) {
//                String input = scan.nextLine();
//                if (input.equals("done")) {
//                    break;
//                }
//                employee.add(input);
//            }
//
//            System.out.println("Element entered");
//            for (String element : employee) {
//                System.out.println(element);
//            }
//            System.out.println("Employee added successfully.");
//        }
//
//        public static Employee findEmployeeById ( int Id){
//            Employee[] employees = new Employee[0];
//            for (Employee employee : employees) {
//                if (employee.getId() == Id) {
//                    return employee;
//                }
//            }
//            return null;
//        }
//
//        public static void updateEmployeeSalary ( int id, double newSalary){
//            Employee employee = findEmployeeById(id);
//            if (employee != null) {
//                employee.remove(employee);
//                System.out.println("Employee not found.");
//
//            }
//        }
//
//        public static void displayAllEmployee (Scanner scanner){
//
//            System.out.println(scanner);
//        }
//
//        public static void removeEmployee () {
//
//        }
//
//        public static void updateEmployeeLeave () {
//            int index = scan.nextInt();
//            scan.nextLine();
//
//            int size = 0;
//            int[] array = new int[size];
//            System.out.println("Enter  the size of the array: ");
//            size = scan.nextInt();
//            System.out.println("Enter " + size + "elements:");
//            for (int i = 0; i < size; i++) {
//                System.out.println("Enter element " + (i + 1) + ": ");
//                array[i] = scan.nextInt();
//                scan.nextLine();
//            }
//            System.out.println(("Array elements:"));
//            for (int element : array) {
//                System.out.println(element + "");
//                scan.close();
//
//            }
//
//            UnicodeSet employee = null;
//            if (index >= 0 && index < employee.size()) {
//                System.out.println("Enter the new value for the element");
//                String newValue = scan.nextLine();
//
//                employee.getClass();
//                System.out.println("Update employee: " + employee);
//            } else {
//                System.out.println("Invalid index. Please enter a valid index within the range.");
//            }
//        }
//
//         public static void displayOptions () {
//            System.out.println("Enter any value from 1 - 6");
//
//            System.out.println("""
//
//                    1. Add Employee
//                    2. Remove Employee
//                    3. Update Employee Salary
//                    4. Update Employee Leave
//                    5. Display All Employee
//                    6. Quit program
//                    Print options""");
//        }
//
//
//    }
//
//    private static void displayOptions() {
//    }
//    }
}