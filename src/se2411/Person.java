package se2411;

public class Person{
    public int id;
    protected String name;
    protected String surname;
    public Person(){

    }
    public Person(int id, String name, String surname){
        this.id = id;
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









}







