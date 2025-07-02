import java.util.Scanner;
public class Compound_Interest {
    void CI(double p,double r,double t,double n){
        double CI= p* Math.pow((1 +(r/(100.0*n))),n*t)-p;
        System.out.println("compund intrest "+CI);
    }
    public static void main(String[] args) {
        Compound_Interest a=new Compound_Interest();
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("enter p");
        double p=sc.nextDouble();
        System.out.println("enter r");
        double r=sc.nextDouble();
        System.out.println("enter t");
        double t=sc.nextDouble();
        System.out.println("enter n");
        double n=sc.nextDouble();
        a.CI(p, r, t, n);
    }
}
