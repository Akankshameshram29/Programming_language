package basic;
import java.util.Scanner;
/**
 * Average
 */
public class Average {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter n:");
     int n = sc.nextInt();
     int sum = 0;
     for(int i=0;i<=n;i++){
        sum += i;
     }
     float avg = (float) sum/n;
     System.out.println("Average:"+ avg);
     sc.close();
   }
    
}
