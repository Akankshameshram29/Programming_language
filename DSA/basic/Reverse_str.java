package basic;
import java.util.Scanner;

public class Reverse_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();
        char[] charArray = str.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[n - 1 - i];
            charArray[n - 1 - i] = temp;
        }

        String reverse_str = new String(charArray);
         
        System.out.println("Reversed string is" + " "+reverse_str);
    }
}
