package Function;
import java.util.Scanner;

public class Que1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number");
        int num3 = sc.nextInt();
        int max_num = max( num1, num2, num3);
        int min_num = min( num1, num2, num3);
        System.out.println("maximum number :"+ max_num);
        System.out.println("minimum number:"+ min_num);
        sc.close();
        
    }

    static int max(int num1, int num2, int num3){
        int max=0;
        if(num1>num2 && num1>num3){
            max = num1;
        }
        else if(num2>num1 && num2 > num3){
            max = num2;
        }
        else if(num3>num1 && num3>num2){
            max = num3;
        }
        return max;
    }

    static int min(int num1,int num2, int num3){
        int min=0;
        if(num1<num2 && num1<num3){
            min = num1;
        }
        else if(num2<num1 && num2<num3){
            min = num2;
        }
        else if(num3<num1 && num3<num1){
            min = num3;
        }
        return min;
    }

}