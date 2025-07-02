
import java.util.Scanner;



class Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            arr[i]=x;
    }
    for(int i = 0; i < n; i++){
        System.out.print(arr[i]+" "); 
    }
    }
}
