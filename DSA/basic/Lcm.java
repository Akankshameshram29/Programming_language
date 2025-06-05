package basic;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter num1");
    int num1 = sc.nextInt();
    System.out.println("enter num2");
    int num2 = sc.nextInt();
    sc.close();
    int a = num1;
    int b = num2;
    while(b!=0){
        int temp =b;
        b = a % b;
        a = temp;
    }
    int gcd = a;
     
    int Lcm = (num1 * num2)/gcd;
    System.out.println("lcm="+Lcm);
    
    }
}
