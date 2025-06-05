package basic;

import java.util.Scanner;

public class Count_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num =  sc.nextInt();
            num = Math.abs(num);
        System.out.println("enter digit to count:");
        int digit =sc.nextInt();
        int count = 0;
        while(num>0){
           int remainder = num % 10;
           if (remainder == digit){
            count++;
           }
           num=num/10;
        }
        System.out.println("count of digit="+ count);
       sc.close();
    }
}

       