public class Employee {
    private int id;
    private String name;
    private double Salary;
    private String address;
    private int age;
    private String leaveDate;


    public Employee(int nextId, String name, double salary) {
    }

    public Employee (int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(int id, String name, double salary, String address, int age, String leaveDate) {
        this.id = id;
        this.name = name;
        Salary = salary;
        this.address = address;
        this.age = age;
        this.leaveDate = leaveDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", leaveDate='" + leaveDate + '\'' +
                '}';

    }

    public void remove(Employee employee) {
    }
}
