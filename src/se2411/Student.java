package se2411;

public class Student extends Person{
    public double gpa;

    public Student(){

    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    public String toString(){
        return "Student" + getId() + getName() + getSurname();
    }






}


