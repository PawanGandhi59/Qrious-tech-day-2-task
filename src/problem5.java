import java.util.Scanner;

public class problem5 {
    public double find_area (int radius){
        return (3.14*radius*radius);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        problem5 p=new problem5();
        System.out.println("Enter radius of cicle:");
        System.out.println(p.find_area(sc.nextInt()));
    }
}
