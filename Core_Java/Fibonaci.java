import java.util.Scanner;
    class Fibonaci {
        public static void main(String[] args) {
        int a=0;
        int b=1;
        
        System.out.println("enter name");
        Scanner sc=new Scanner(System.in);
        sc.close();
        double n=sc.nextDouble();
        for (int i = 0; i < n; i++) {
            i=a+b;
            a=b;
            b=i;
            System.out.println(i);
        }
    }
}
