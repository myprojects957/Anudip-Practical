import java.util.Scanner;

public class Armstrong_number {
    void sol(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of digits in number check : ");
      int size = sc.nextInt();
      int sum = 0;
      for(int i=0 ; i<size ; i++)
      {
        System.out.println("enter digit at position "+(i+1));
        int num = sc.nextInt();
        sum += Math.pow(num, size);
      }
      System.out.println("enter the whole number now  :");
      int OG = sc.nextInt();
      if (OG == sum) {
        System.out.println("The number is armstrong !!");
      }
      sc.close();
    }
}
