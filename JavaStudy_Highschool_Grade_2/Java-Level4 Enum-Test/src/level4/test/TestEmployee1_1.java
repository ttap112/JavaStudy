package level4.test;

public class TestEmployee1_1 {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(3000, 500);
        Employee contractEmployee = new ContractEmployee(2500);
        Employee internEmployee = new InternEmployee(1500);

        System.out.println("Full Time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Contract Employee Salary: " + contractEmployee.calculateSalary());
        System.out.println("Intern Employee Salary: " + internEmployee.calculateSalary());

        System.out.println();

        System.out.println(fullTimeEmployee.toString());
        System.out.println(contractEmployee.toString());
        System.out.println(internEmployee.toString());
    }
}