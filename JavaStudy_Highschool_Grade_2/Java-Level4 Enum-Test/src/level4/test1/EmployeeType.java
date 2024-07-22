package level4.test1;

public enum EmployeeType {
    FULL_TIME(1.0),
    CONTRACT(0.8),
    INTERN(0.5);

    private final double salaryMultiplier;

    EmployeeType(double salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }

    public double adjustBaseSalary(double baseSalary) {
        return baseSalary*salaryMultiplier;
    }


}
