package basic;
import java.util.Scanner;


public class Product_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        String Number = sc.nextLine();
        int product=1;
        int Sum =0;
        for(int i = 0; i<Number.length();i++){
        int digit = Character.getNumericValue(Number.charAt(i));
         product *= digit;
         Sum += digit;
        }
       int Result = product - Sum;
       System.out.println("result = " + Result);
       sc.close();
    }
}
