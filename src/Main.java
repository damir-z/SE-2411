import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gender:");
        String scgender = scan.nextLine();
        System.out.println("IMA:");
        String scname = scan.nextLine();
        System.out.println("Surname:");
        String scsurname = scan.next();
        System.out.println("AGE:");
        int scage = scan.nextInt();
        File file = new File("C:\\Users\\User\\Downloads");
        Person person = new Person(scname, scage, scgender, scsurname);
        Student student = new Student(scname, scage, scgender, scsurname, new int[] {100, 100, 100, 95, 85}, 1);

    }


}