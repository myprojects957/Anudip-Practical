import java.util.Scanner;

public class pattern_Binnary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.close();
        int rows = sc.nextInt();
        int binnary_0=0;
        int binnary_1=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <i; j++) {
                    if(i%2==0){
                    if(j%2==0){
                        System.err.print(binnary_0);}
                    else{
                        System.err.print(binnary_1);
                    }
                    }
                else{
                    if(j%2==0){
                    System.err.print(binnary_1);}
                    else{
                        System.err.print(binnary_0);
                    }
                }
            }
            System.err.println();
            
        }

    }
}

