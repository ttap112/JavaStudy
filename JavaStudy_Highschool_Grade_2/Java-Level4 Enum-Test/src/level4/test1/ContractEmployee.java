package level4.test1;

public class ContractEmployee implements Employee{
    private double baseSalary;
    private EmployeeType employeeType;

    public ContractEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
        this.employeeType = EmployeeType.CONTRACT;
    }

    @Override
    public double calculateSalary() {
        return employeeType.adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + employeeType +
                '}';
    }
}
