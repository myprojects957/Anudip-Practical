import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice == -1) {
            System.out.print("Enter basic salary : ");
            double basicSalary = sc.nextDouble();
            double hra;
            double da;
            double grossSalary;
            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary;
                da = 0.60 * basicSalary;
            } else {
                hra = 3000;
                da = 0.70 * basicSalary;
            }
            grossSalary = basicSalary + hra + da;
            System.out.println("Gross Salary = " + grossSalary);
            System.out.print("Enter -1 to continue or any other number to exit: ");
            choice = sc.nextInt();
        }
        System.out.println("Salary calculation ended.");
        sc.close();
    }
}
