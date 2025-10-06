import java.util.ArrayList;
import java.util.Scanner;

public class problem1 {
    public ArrayList<Integer> multipliers(int num){
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                arrayList.add(i);
                arrayList.add(num/i);
            }
        }
        arrayList.add(num);
        return arrayList;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        problem1 p=new problem1();
        System.out.println(p.multipliers(num));
    }
}
