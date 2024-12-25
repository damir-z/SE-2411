public class Student extends Person{
    private int ID;
    private static int id_gen = 0;
    private int[] grades;
    public feel feeling = new feel(true, 2);

    public Student(String name, int age, String gender, String surname, int[] grades, int ID){
        System.out.println("Info about Student:");
        setGrades(grades);
        System.out.println(toString());
        calcGPA(grades);
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
    class feel{
        private boolean feeling;
        private int grad;
        public feel(boolean feeling, int grad){
            this.feeling = feeling;
            this.grad = grad;
        }
        public void check(){
            if(grad > 3){
                feeling = true;
            }
            else{
                feeling = false;
            }
            if(feeling){
                System.out.println("I'm feeling good!!");
            }
            else {
                System.out.println("I feel bad ):");
            }

        }


    }


}
