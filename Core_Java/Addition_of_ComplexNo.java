import java.util.*;
public class Addition_of_ComplexNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("enter first complex num:");
        System.out.println("enter real part:");
        int real= sc.nextInt();
        System.out.println("enter imag part");
        int imag =sc.nextInt();
        System.out.println(real+"+"+ imag +"i");

         System.out.println("enter second complex num:");
        System.out.println("enter real part:");
        int real1= sc.nextInt();
        System.out.println("enter imag part");
        int imag1 =sc.nextInt();
        System.out.println(real1+"+"+ imag1 +"i");
        System.out.println("Addition is:");
        System.err.println((real+real1)+"+"+(imag+imag1)+"i");
    }
}

