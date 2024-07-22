package level4.test;

public class TestEmployee1_2 {
    public static void main(String[] args) {
        Employee[] EmployeeList = {
                new FullTimeEmployee(3000,500),
                new ContractEmployee(2500),
                new InternEmployee(1500)
        };
        for (Employee employee : EmployeeList) {
            System.out.println(employee.getEmployeeType()+" Employee Salary : "+employee.calculateSalary());
        }

        System.out.println();
        for (Object obj : EmployeeList) {
            System.out.println(obj);
        }
    }

}