
package basic;

import java.util.Scanner;
public class Fibonacci { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt(); 
        
        int a = 0;
        int b = 1;
        int count = 2;
        
        System.out.println("fibonacci series = ");
        System.out.println(a);
        while(count <=n){
            int temp =b;
            b = b+a;
            a=temp;
            System.out.println(b);
            count ++;
        }
        
        System.out.println("nth element of the fibonacci series = "+" "+b);
        sc.close(); 
    }
}
