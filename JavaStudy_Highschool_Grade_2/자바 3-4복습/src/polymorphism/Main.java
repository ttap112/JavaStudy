package polymorphism;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith","Math",5);
        Teacher teacher2 = new Teacher("Ms. Johnson","English",10);
        Student student1 = new Student("Alice",10,"512345");
        Student student2 = new Student("Bob",11,"554321");
        Student student3 = new Student("Charlie",12,"567890");

        Person[] people = {teacher1,teacher2,student1,student2,student3};

        printPersonInfo(people);
    }

    private static void printPersonInfo(Person[] people) {
        System.out.println("====Person Info");
        for (Person person : people) {
            if (person instanceof Teacher) {
                person.showInfo();
                ((Teacher) person).showStudents();
                ((Teacher) person).teach();
                System.out.println();
            } else {
                person.showInfo();
                System.out.println();
            }
        }
    }
}
