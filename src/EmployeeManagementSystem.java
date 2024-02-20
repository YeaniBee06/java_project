import java.util.ArrayList;

public class EmployeeManagementSystem {
    private ArrayList<Employee>employees;
    private int nextId;
    public EmployeeManagementSystem () {
        employees = new ArrayList<>();
        nextId = 1;

    }

    public  void addEmployee(String name, double salary) {
        Employee newEmployee = new Employee(nextId, name, salary);
        employees.add(newEmployee);
        nextId++;
        System.out.println("Employee added successfully.");
    }

    public Employee findEmployeeById(int Id) {
        for(Employee employee : employees) {
            if (employee.getId()== Id){
                return employee;
            }
        }
        return null;
    }
    public void updateEmployeeSalary(int id, double newSalary) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.remove(employee);
            System.out.println("Employee not found.");

        }
    }

    public void displayAllEmployee() {
    }

    public void removeEmployee(int idToRemove) {
    }

    public void updateEmployeeLeave(int idToUpdateLeave, String newLeaveDate) {
    }

    public void addEmployee() {
    }

    public void removeEmployee() {
    }

    public void updateEmployeeSalary() {
    }

    public void updateEmployeeLeave() {
    }
}

