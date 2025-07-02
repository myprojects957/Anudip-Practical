
import java.util.Scanner;

public class Simple_Interest {
    void SI(int principle,int rate,int time){
        int SI=principle*rate*time;
        System.out.println("simple intrest "+SI);
    }
    public static void main(String[] args) {
        Simple_Interest a=new Simple_Interest();
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("enter p");
        int p=sc.nextInt();
        System.out.println("enter r");
        int r=sc.nextInt();
        System.out.println("enter t");
        int t=sc.nextInt();
        a.SI(p, r, t);
        sc.close();
        
    }
}
