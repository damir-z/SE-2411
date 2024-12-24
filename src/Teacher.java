public class Teacher extends Person{
    public String subject;
    public int yearOfExp;
    public int salary;
    public int percentage;

    public Teacher(String subject, int yearOfExp, int salary, int percentage) {
        System.out.println("Info about Teacher:");
        setValues(subject, yearOfExp, salary, percentage);
        getRaise(salary, yearOfExp, percentage);
        System.out.print(toString());
    }
    public void setValues(String subject, int yearOfExp, int salary, int percentage) {
        this.subject = subject;
        this.percentage = percentage;
        this.salary = salary;
        this.yearOfExp = yearOfExp;
    }
    public void getRaise(int salary, int yearOfExp, int percentage) {
        if(yearOfExp > 10){
            this.salary *= percentage;
        }
    }
    public String toString(){
        return "I teach " + subject + ", my exp: " + yearOfExp + ", salary: " + salary;
    }







}
