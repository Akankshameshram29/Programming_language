package basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING:");
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("\\s","").toLowerCase();
         int low = 0;
         int high = sentence.length()-1;
         boolean Palin_drome = true;
        while (low<high){
            if (sentence.charAt(high) != sentence.charAt(low)){
               Palin_drome = false;
               break;
            }
            low++;
            high--;
        }
        if(Palin_drome == true){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
        sc.close();

    }
}
