import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n= sc.nextInt(),i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=n-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--){
            for(j=0;j<n-1;j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
