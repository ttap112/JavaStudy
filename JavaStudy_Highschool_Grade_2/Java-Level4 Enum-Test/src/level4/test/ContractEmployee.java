package level4.test;

public class ContractEmployee implements Employee{

    private final double baseSalary;



    ContractEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return getEmployeeType().adjustBaseSalary(baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.CONTRACT;
    }
    @Override
    public String toString() {
        return "ContractEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType="+getEmployeeType().getName()+'}';
    }
}
