package basic;
import java.util.Scanner;

public class Perfect_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int NUM = sc.nextInt();
        int Sumoffactor = 0;
        for(int factor = 1;factor<NUM;factor++){
            if(NUM% factor == 0)
             Sumoffactor+= factor;
        }
        if(NUM == Sumoffactor){
          System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
       sc.close();
    }
}