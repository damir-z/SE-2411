public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String gender;
    public Person(){

    }
    public Person(String name, int age, String gender, String surname){
        setValues(name, age, gender, surname);
        System.out.print(toString());
    }
    public void setValues(String name, int age, String gender, String surname){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.surname = surname;
    }

    public String toString(){
        return "Hi, i'm, " + name + " " + surname +  " a " + age + " years old," + " Gender: " + gender;
    }

}


