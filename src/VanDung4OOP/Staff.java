package VanDung4OOP;

public class Staff extends Employee {
    public Staff(String name, int age, String address, double baseSalary, String departmentId) {
        super(name, age, address, baseSalary, "Staff", departmentId);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}
