package Function;
import java.util.Scanner;
public class pythagorus { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");
        int h = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        boolean result = pythagorus_check(h, b, p);
        System.out.println("this triplet is a pythagorous triplet:"+result);
        sc.close();
    }
    static boolean pythagorus_check(int a, int b, int c){
        if(a*a ==  b*b + c*c){
           return true;
        }
        else{
            return false;
        }
    }
}
