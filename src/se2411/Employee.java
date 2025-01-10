package se2411;

public class Employee extends Person {
    public String position;
    public double salary;
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition(){
        return this.position;
    }
    public void setPosiotion(String position){
        this.position = position;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return "Employee" + id + " " + name + " " + surname;
    }

}
