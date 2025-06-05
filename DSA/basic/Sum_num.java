package basic;
import java.util.Scanner;

public class Sum_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int  sum = 0;
        int largest = 0;
        int num;
        do{
            num = sc.nextInt();
            sum += num;
            if(num>largest){
                largest = num;
            }
        }
        while( num != 0);

        System.out.println("sum = "+" "+sum);
        System.out.println("largest number ="+" "+largest);

        sc.close();

    }
}
