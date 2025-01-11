package se2411;

public class Student extends Person implements Payable {
    public double gpa;

    public Student() {

    }

    public Student(int id, String name, String surname, double gpa) {
        super(id, name, surname);
        this.gpa = gpa;
    }




    @Override
    public double getPaymentAmount() {
        if (gpa >= 2.67) {
            return 36600;
        }
        else
            return 0;
    }

    public String toString() {
        return "Student" + " " + getId() + " " + getName() + " " + getSurname() + " " + getPaymentAmount();
    }
}


