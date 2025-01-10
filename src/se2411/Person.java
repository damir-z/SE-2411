package se2411;

public class Person implements Payable_student, Payable_employee {
    public int id;
    protected String name;
    protected String surname;
    public Person(){

    }
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurName(String surname){
        this.surname = surname;
    }

    public String toString(){
        return getId() + " " + getName() + " " + getSurname();
    }
    public String getPosition(){
        return "Student";
    }

    @Override
    public double getStipend(){
        return 36600;
    }





}







