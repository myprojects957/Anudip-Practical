
import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter Char : ");
        char c=sc.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println(c+" is Vowel");
        }else{
            System.out.println("It is Consonant");
        }
    }
}
