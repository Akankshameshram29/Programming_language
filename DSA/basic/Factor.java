package basic;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENtER NUM:");
        int NUM = sc.nextInt();
        System.out.println("factor of Number"+ NUM+ "=");
        for(int factor = 2;factor<NUM;factor++){
            if(NUM% factor == 0)
            System.out.println(factor);
        }
        sc.close();

    }
}
