package VanDung4OOP;

public class Manager extends Employee {
    private double allowance = 5_000_000;

    public Manager(String name, int age, String address, double baseSalary, String departmentId) {
        super(name, age, address, baseSalary, "Manager", departmentId);
    }

    public double getAllowance() { return allowance; }
    public void setAllowance(double allowance) { this.allowance = allowance; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance;
    }
}
