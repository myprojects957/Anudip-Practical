
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        sc.close();
        int n=sc.nextInt();
        switch (n) {
            case 1 :
                System.out.println("Good Morning");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            
            default:
                System.out.println("Invalid");
        }
    }
}
