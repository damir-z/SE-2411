public class Student extends Person{
    private int ID;
    private int[] grades;

    public Student(String name, int age, String gender, String surname, int[] grades, int ID){
        System.out.println("Info about Student:");
        setGrades(grades);
        System.out.println(toString());
        calcGPA(grades);
        this.ID = ID;
    }
    public void setGrades(int[] grades){
        this.grades = grades;
    }
    @Override
    public String toString(){
        return "I am a student with ID: " + ID;

    }
    public void calcGPA(int[] grades){
        float sum = 0;
        float step = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
            step++;
        }
        float res = sum / step;
        System.out.println("My GPA: " + res);
    }

}
