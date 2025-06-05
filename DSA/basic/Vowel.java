package basic;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ALPHABET OR WORD");
        String alphabet = sc.nextLine().toLowerCase();
        sc.close();
        if (alphabet.length() == 0) {
            System.out.println("Please enter an alphabetic word.");
        } else {
            char ch = alphabet.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a vowel");
            } else if (Character.isLetter(ch)) {
                System.out.println("It is a consonant");
            } else {
                System.out.println("Please enter a valid alphabet character or word.");
            }
        }
    }
}
