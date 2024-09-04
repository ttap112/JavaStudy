package Class;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith","Math",5);
        Teacher teacher2 = new Teacher("Ms. Johnson","English",10);
        Student student1 = new Student("Alice",10,"512345");
        Student student2 = new Student("Bob",11,"554321");
        Student student3 = new Student("Charlie",12,"567890");

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);

        System.out.println("========Teacher Info========");
        teacher1.showInfo();
        teacher1.showStudents();
        System.out.println(" ");
        System.out.println();

        teacher2.showInfo();
        teacher2.showStudents();
        System.out.println();

        System.out.println("========Student Info========");
        student1.showInfo();
        System.out.println();

        student2.showInfo();
        System.out.println();

        student3.showInfo();

    }
}
