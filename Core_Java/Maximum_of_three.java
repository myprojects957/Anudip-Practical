
import java.util.Scanner;

public class Maximum_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter c");
        int c=sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println("largest is "+a);
        }
        else if(a<b && b>c){
            System.out.println("largest is "+b);
        }
        else{
            System.out.println("laggest is "+c);
        }
        
    }
}
