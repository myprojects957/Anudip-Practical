import java.util.Scanner;

public class ArmstrongNumbers {
    public static void printArmstrongNumber(int start,int end) {
        for (int numb=start; numb<=end; numb++) {
            int originalNumber = numb;
            int sum = 0;

            while (originalNumber > 0) {
                int digit = originalNumber % 10;
                
                int cube = 1;
                for (int i = 1; i <= 3; i++) {
                    cube *= digit;
                }
                sum += cube;
                originalNumber /= 10;
            }
            if (sum == numb) {
                System.out.println(numb + " is an Armstrong number.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range : ");
        int start = sc.nextInt();

        System.out.print("Enter ending range : ");
        int end = sc.nextInt();
        System.out.println("");

        System.out.println("Armstrong numbers from " + start + " to " + end + " are : \n");
        printArmstrongNumber(start, end);

        sc.close();
    }
}

    