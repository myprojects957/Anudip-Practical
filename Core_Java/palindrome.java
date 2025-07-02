import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        System.out.print("Enter Name : ");
        Scanner sc=new Scanner(System.in);
        sc.close();
        String A = sc.nextLine();
        boolean isPalindrome = true;
        int len = A.length();

        for (int i = 0; i < len; i++) {
                if (A.charAt(i) != A.charAt(len - 1 - i)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome) {
            System.out.println(A + " is a Palindrome.");
        } else {
            System.out.println(A + " is not a Palindrome.");
        }
    }
}
