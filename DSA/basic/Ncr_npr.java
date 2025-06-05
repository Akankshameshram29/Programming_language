package basic;
import java.util.Scanner;

public class Ncr_npr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N:");
        int N = sc.nextInt();
        System.out.println("ENTER r:");
        int r = sc.nextInt();
        sc.close();

        int fact_N = 1;
        int fact_r = 1;
        int fact_diff = 1;

        
        for(int i = 1; i <= N; i++) {
            fact_N *= i;
        }

    
        for(int i = 1; i <= r; i++) {
            fact_r *= i;
        }

        int diff = N - r;
        for(int i = 1; i <= diff; i++) {
            fact_diff *= i;
        }

        
        int permutation = fact_N / fact_diff;
        int combination = fact_N / (fact_r * fact_diff);

        System.out.println("Permutation NPr = " + permutation);
        System.out.println("Combination NCr = " + combination);
    }
}
