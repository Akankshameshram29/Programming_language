package Function;

import java.util.Scanner;

public class SUM_PROD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int sum_result = sum(num1, num2);
        int product_result = product(num1, num2);
        System.out.println("Addition of two numbers ="+ sum_result);
        System.out.println("Product of two numbers ="+ product_result);
    }

    static int sum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

    static int product(int num1,int num2){
        int product = num1 * num2;
        return product;
    }
}
