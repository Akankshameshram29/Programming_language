package Function;
import java.util.Scanner;

public class sumofn_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:"); 
        int n= sc.nextInt();
        int result = sum_num(n);
        System.out.println("sum of n numbers"+n+"="+ result);
        sc.close();

    }
    
    static int sum_num(int n){
        int sum = 0;
        for(int i =0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

}
