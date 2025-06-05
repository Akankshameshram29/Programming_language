package Function;

import java.util.Scanner;

public class Func_evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String result = even_odd(num);
        System.out.println("the number is "+result);
        sc.close();
    }
    static String even_odd(int num){
    
        if (num% 2==0){
           return "even";
        }
        else{
            return "odd";
        }
    }
    
}


