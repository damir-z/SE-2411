package se2411;

public class Employee extends Person implements Payable{
    public String position;
    public double salary;
    public Employee(int id, String name, String surname, String position, double salary){
        super(id, name, surname);
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

    public void setId(int id){
        this.id = id;
    }


    @Override
    public double getPaymentAmount(){
        return salary;
    }
    public String toString(){
        return "Employee" + id + " " + name + " " + surname + " " + position + " " + getPaymentAmount();
    }

}
