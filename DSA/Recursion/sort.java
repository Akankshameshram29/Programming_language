package Recursion;

public class sort{
    public static void main(String[] args) {
        int [] arr = {1,3,4,8,9};
        System.out.println(sortArray(arr, 0));
    }
    static boolean sortArray(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sortArray(arr, index+1);
    }
}