import java.util.Scanner;

public class DDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size : ");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter Data : ");
        sc.close();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col]=sc.nextInt();
    }
}
System.out.println("Array is : ");
    for(int row = 0; row < n; row++){
        for(int col = 0; col < n; col++){
            System.out.print(" "+arr[row][col]+" "); 
    }
    System.out.println();
    }
    
    }
}
