package level4.test;

public class FullTimeEmployee implements Employee{

    private final double baseSalary;
    private final double bonus;



    FullTimeEmployee(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getEmployeeType().adjustBaseSalary(baseSalary)+bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.FULL_TIME;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", employeeType="+getEmployeeType().getName()+'}';
    }
}
