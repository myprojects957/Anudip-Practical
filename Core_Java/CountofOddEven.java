import java.util.Scanner;

public class CountofOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even= 0;
        int odd= 0;
        int number;
        System.out.println("Enter numbers or you want to stop the loop enter -1 :");

        while (true) {
            System.out.print("Enter number : ");
            number = sc.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("\nTotal Even Numbers : " + even);
        System.out.println("Total Odd Numbers : " + odd);

        sc.close();
    }
}
