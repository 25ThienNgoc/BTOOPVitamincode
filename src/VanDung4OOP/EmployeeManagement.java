package VanDung4OOP;

public interface EmployeeManagement {
    void addDepartment(Department department);
    void updateDepartment(String departmentId, String newName, String newAddress);
    void addEmployee(Employee employee);
    void updateEmployee(String employeeId, String newName, int newAge, String newAddress, double newBaseSalary);
    void showAllDepartments();
    void showEmployeesByDepartment(String departmentId);
    void showAllEmployees();
    void showManagersAndViceManagers();
    void showTotalSalaryByDepartment();
}
