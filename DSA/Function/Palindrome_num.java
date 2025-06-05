package Function;
import java.util.Scanner;
public class Palindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        boolean result = palindrome(number);
        System.out.println("The number is palindrome :" + result);
       sc.close();
    }
    
    static boolean palindrome(int number){
        String str = Integer.toString(number);
        int [] array = new int[str.length()];
        int low = 0;
        int high = str.length()-1;
        boolean palindrome = true;
        while(low<high){
           if(array[low] != array[high]){
             palindrome = false;
             break;
           }
           low++;
           high--;
        }
        return palindrome;
    }


    

}
