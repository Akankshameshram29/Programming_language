package basic;

import java.util.Scanner;

public class Armstrong_num {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int Number = sc.nextInt();
        String digits = Integer.toString(Number);
        int power = digits.length();
        int Armstrong = 0;
        for(int i= 0;i<power;i++){
            int digit = Character.getNumericValue(digits.charAt(i));
            int result = (int) Math.pow(digit,power);
            Armstrong  += result;
        }
         
        if(Number == Armstrong){
            System.out.println("It is a Armstrong Number");
        }
        else{
            System.out.println("It is not a Armstrong number");
        }

        
        sc.close();
        
    }
}
