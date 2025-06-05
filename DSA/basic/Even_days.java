package basic;
import java.util.Scanner;

public class Even_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter month:");
            String month = sc.next();

            System.out.println("Enter number of days in the month " + month + ":");
            int no_of_days = sc.nextInt();

            int count = 0;
            for (int i = 1; i <= no_of_days; i++) { // start from 1 instead of 0
                if (i % 2 == 0) {
                    count++;
                }
            }

            System.out.println("You can go out " + count + " days in the month " + month + ".");
    
        sc.close();
    }
}


