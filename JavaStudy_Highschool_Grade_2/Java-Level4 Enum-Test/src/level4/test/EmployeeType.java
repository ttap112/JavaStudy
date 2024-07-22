package level4.test;

public enum EmployeeType {
    FULL_TIME(1.0,"FULL_TIME"), CONTRACT(0.8,"CONTRACT"), INTERN(0.5,"INTERN");

    private final double Salary;
    private final String Name;

    EmployeeType(double Salary, String Name) {
        this.Salary = Salary;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public double adjustBaseSalary(double BaseSalary) {
        return BaseSalary*getSalary();
    }


}
