import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println("Addition: " + sum);

        int mul = a * b;
        System.out.println("Multiplication: " + mul);

        int differ = a - b;
        System.out.println("Subtraction: " + differ);

        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        sc.close();
    }
}