package Function;
import java.util.Scanner;

public class All_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find the prime numbers between them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The prime numbers between " + a + " and " + b + " are:");
        allPrime(a, b);
        sc.close();
    }
    
    static void allPrime(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
