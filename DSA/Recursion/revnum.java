package Recursion;

public class revnum {
 public static void main(String[] args) {
  revnum1(2345);
  System.out.println(sum);  
 }
static int sum =0;
static void revnum1(int n){
    if(n==0){
        return;
    }
    int remainder =n % 10;
    sum = sum*10+remainder;
    revnum1(n/10);
 }

}

