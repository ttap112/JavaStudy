package level4.test1;

public class FullTimeEmployee implements Employee{

    private final double baseSalary;
    private final double bonus;
    private EmployeeType employeeType;

    public FullTimeEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.employeeType = EmployeeType.FULL_TIME;
    }

    @Override
    public double calculateSalary() {
        return employeeType.adjustBaseSalary(baseSalary)+bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", employeeType=" + employeeType +
                '}';
    }
}
