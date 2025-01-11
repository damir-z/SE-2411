package se2411;

public class MyApplication {
    public static void main(String[] args) {
        Person person = new Person(1, "John", "Smith");
        System.out.println(person.toString());
        Employee employee_1 = new Employee(2, "Will" ,"Smith", "actor", 600_000);
        System.out.println(employee_1.toString());
        Student student_1 = new Student(2, "Harry", "Potter", 2.57);
        System.out.println(student_1.toString());
    }
}
