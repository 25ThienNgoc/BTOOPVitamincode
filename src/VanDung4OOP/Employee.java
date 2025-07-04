package VanDung4OOP;
import java.util.UUID;

public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private String address;
    private double baseSalary;
    private String position;
    private String departmentId;

    public Employee(String name, int age, String address, double baseSalary, String position, String departmentId) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.address = address;
        this.baseSalary = baseSalary;
        this.position = position;
        this.departmentId = departmentId;
    }

    // Getters và Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    public abstract double calculateSalary();

    public void showInfo() {
        System.out.printf("ID: %s, Name: %s, Age: %d, Address: %s, Position: %s, DepartmentID: %s, Salary: %.2f\n",
                id, name, age, address, position, departmentId, calculateSalary());
    }
}
