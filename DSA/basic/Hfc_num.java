package basic;
import java.util.Scanner;

public class Hfc_num{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers:"); 
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();
    
    while(x!=0){
            int remainder = y%x;
            y=x;
            x= remainder;
    }
    int hcf = y;
    System.out.println("hfc="+ hcf);


  }
}
