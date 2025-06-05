package basic;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER principle amount:");
        int principle_amt = sc.nextInt();
        System.out.println("Enter time:");
        int Time = sc.nextInt();
        System.out.println("Enter rate of interest:");
        int Rate = sc.nextInt();

        int final_amt = principle_amt*(1+Time*Rate);
        System.out.println("final amount=" + final_amt);
        sc .close();
    }
}
