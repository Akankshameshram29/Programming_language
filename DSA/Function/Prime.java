package Function;
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sc.close();
        boolean result = isPrime(number);
        System.out.println("The number  "+number+" is prime:"+result);
        
    }

    static boolean isPrime(int number){
       if(number<2){
         return false;
       }
       for (int i = 2;i<=Math.sqrt(number);i++){
        if(number % i == 0){
           return false;
        }
      }
       return true;
    }
}