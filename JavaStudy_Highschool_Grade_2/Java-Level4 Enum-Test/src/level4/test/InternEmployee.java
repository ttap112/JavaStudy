package level4.test;

public class InternEmployee implements Employee{

    private final double baseSalary;



    InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return getEmployeeType().adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.INTERN;
    }
    @Override
    public String toString() {
        return "InternEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType="+getEmployeeType().getName()+'}';
    }
}
