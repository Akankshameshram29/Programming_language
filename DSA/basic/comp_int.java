package basic;
import java.util.Scanner;


public class comp_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:");
        int principle_amt = sc.nextInt();
        System.out.println("Enter rate of interest:");
        float rate_interest = sc.nextFloat();
        System.out.println("Enter number of time interest applied per time period:");
        int n = sc.nextInt();
        System.out.println("Enter number of time periods elapsed:");
        int time = sc.nextInt();
        rate_interest = rate_interest/100;
        int pow = n*time;
        float amt = (1+rate_interest/n);
        float comp_int =  (float) Math.pow(amt,pow);
        float final_amt = principle_amt * comp_int;
         
        System.out.println("Compound interest for principle amount :" + principle_amt+ "and interest rate: " + rate_interest * 100 + " %= "+ final_amt );
        sc.close();

    }
}
