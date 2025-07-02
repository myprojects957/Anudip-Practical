//compile time
import java.util.*;

class Student {
    String Name;
    int Age;
    public Student(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Name : ");
        Name=sc.nextLine();
        System.out.print("Enter Age : ");
        Age =sc.nextInt();
        sc.close();
        System.out.println("Student Data : ");
    }
    
    public void PrintInfo(String Name){
        System.out.println("Name : "+Name);
    }
    public void PrintInfo(int Age){
        System.out.println("Age : "+Age);
    }
    
}
public class Polymorphism_Compile_time{
        public static void main(String[] args) {
        Student s1=new Student();
        s1.PrintInfo(s1.Name);
        s1.PrintInfo(s1.Age);
    }
}
