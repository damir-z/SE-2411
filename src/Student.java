import java.io.File;
import java.util.Scanner;
public class Student extends Person{
    private int ID;
    private int[] grades;
    public void setGrades(int[] grades){
        this.grades = grades;
    }
    public Student(String name, int age, String gender, String surname){
        super(name, age, gender, surname);
    }
    public void calcGPA(int[] grades){
        int sum = 0;
        int step = 0;
        for (int i = 0; i < grades.length(); i++){
            sum += grades[i];
            step++;
        }
        int res = sum / step;
        System.out.print(res);
    }
}
