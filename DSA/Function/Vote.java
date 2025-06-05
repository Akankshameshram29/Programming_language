package Function;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        String result = vote_criteria(age);
        System.out.println(result);
    }

    static String vote_criteria(int age){
        if (age>=18){
            return "Congrats! You are eligible to vote";
        }
        else{
            return"Sorry!! you are not eligible to vote";
        }
    }
}
