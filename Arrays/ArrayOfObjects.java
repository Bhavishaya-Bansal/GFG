import java.util.*;

class Student{
    public int rollNo;
    public String name;
    public Student(int rollNo, String name){
        this.rollNo= rollNo;
        this.name= name;        
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student arr[]= new Student[3];
        arr[0]= new Student(1, "bhav");
        arr[1]= new Student(2, "aman");
        arr[2]= new Student(3, "yash");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].rollNo+ " "+ arr[i].name);
        }
    }
}
