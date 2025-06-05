package Recursion;

public class Sumarray {
  public static void main(String[] args) {
    int [] arr ={1,2,3,4,5};
    int ans = sum1(arr, 0);
    System.out.println(ans);
  }
  static int sum1(int [] arr,int index){
    if(index==arr.length){
        return 0;
    }
    return  arr[index] + sum1(arr,index+1);
  }
    
}