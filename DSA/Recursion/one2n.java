package Recursion;

public class one2n {
    public static void main(String [] args){
        funrev(6);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}
