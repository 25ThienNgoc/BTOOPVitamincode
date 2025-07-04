package VanDung4OOP;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementImpl implements EmployeeManagement {
    private List<Department> departments;

    public EmployeeManagementImpl() {
        this.departments = new ArrayList<>();
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void updateDepartment(String departmentId, String newName, String newAddress) {
        for (Department dept : departments) {
            if (dept.getDepartmentId().equals(departmentId)) {
                dept.setDepartmentName(newName);
                dept.setDepartmentAddress(newAddress);
                return;
            }
        }
        System.out.println("Department not found!");
    }

    @Override
    public void addEmployee(Employee employee) {
        for (Department dept : departments) {
            if (dept.getDepartmentId().equals(employee.getDepartmentId())) {
                dept.addEmployee(employee);
                return;
            }
        }
        System.out.println("Department not found!");
    }

    @Override
    public void updateEmployee(String employeeId, String newName, int newAge, String newAddress, double newBaseSalary) {
        for (Department dept : departments) {
            for (Employee emp : dept.getEmployees()) {
                if (emp.getId().equals(employeeId)) {
                    emp.setName(newName);
                    emp.setAge(newAge);
                    emp.setAddress(newAddress);
                    emp.setBaseSalary(newBaseSalary);
                    return;
                }
            }
        }
        System.out.println("Employee not found!");
    }

    @Override
    public void showAllDepartments() {
        for (Department dept : departments) {
            System.out.printf("ID: %s, Name: %s, Address: %s\n", dept.getDepartmentId(), dept.getDepartmentName(), dept.getDepartmentAddress());
        }
    }

    @Override
    public void showEmployeesByDepartment(String departmentId) {
        for (Department dept : departments) {
            if (dept.getDepartmentId().equals(departmentId)) {
                dept.showEmployees();
                return;
            }
        }
        System.out.println("Department not found!");
    }

    @Override
    public void showAllEmployees() {
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    @Override
    public void showManagersAndViceManagers() {
        for (Department dept : departments) {
            for (Employee emp : dept.getEmployees()) {
                if (emp.getPosition().equals("Manager") || emp.getPosition().equals("Vice Manager")) {
                    emp.showInfo();
                }
            }
        }
    }

    @Override
    public void showTotalSalaryByDepartment() {
        for (Department dept : departments) {
            System.out.printf("Department: %s, Total Salary: %.2f\n", dept.getDepartmentName(), dept.calculateTotalSalary());
        }
    }
}