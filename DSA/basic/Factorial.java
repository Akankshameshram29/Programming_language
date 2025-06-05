package basic;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int number = sc.nextInt();
       int fact_num = 1;
        for (int i = 1;i<=number;i++){
            fact_num *= i;
        }
       System.out.println("Factorial"+" = "+ fact_num);
       sc.close();
    }
}
