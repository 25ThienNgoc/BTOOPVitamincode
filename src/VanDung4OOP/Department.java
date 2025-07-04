package VanDung4OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Department {
    private String departmentId;
    private String departmentName;
    private String departmentAddress;
    private List<Employee> employees;

    public Department(String departmentName, String departmentAddress) {
        this.departmentId = UUID.randomUUID().toString();
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.employees = new ArrayList<>();
    }

    // Getters và Setters
    public String getDepartmentId() { return departmentId; }
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentAddress() { return departmentAddress; }
    public void setDepartmentAddress(String departmentAddress) { this.departmentAddress = departmentAddress; }
    public List<Employee> getEmployees() { return employees; }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee emp : employees) {
            emp.showInfo();
        }
    }

    public double calculateTotalSalary() {
        double total = 0;
        for (Employee emp : employees) {
            total += emp.calculateSalary();
        }
        return total;
    }
}