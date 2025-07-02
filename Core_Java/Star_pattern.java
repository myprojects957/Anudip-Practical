
import java.util.Scanner;

public class Star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        sc.close();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if(i==1 || i==rows || j==1 || j==rows){
                System.out.print("* ");
            }
                else if(j== rows-(i-1)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        
    }
    System.out.println();
}
    }
}
