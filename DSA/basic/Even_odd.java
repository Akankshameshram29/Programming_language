package basic;
import java.util.Scanner;


public class Even_odd {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int x = sc.nextInt();

      if(x % 2 == 0){
        System.out.println("Even number");
      } else{
        System.out.println("odd number");
      }
      
      sc.close();
    }
      
}
