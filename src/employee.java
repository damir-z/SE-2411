import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
// OOP HULI
public class employee {
    public String name;
    public int age;
    public int weight;
    public int[] arr;
    public employee(){
        System.out.println("BODY BUILDER:");
    }


    public void setValues(String name, int age, int weight, int[] arr){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.arr = arr;
    }
    public String getValues(){
        String info = name + " " + age + " " + weight + " " + "\n";
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        return info;
    }



}

