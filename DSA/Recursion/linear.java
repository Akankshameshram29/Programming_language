package Recursion;

import java.util.ArrayList;

public class linear {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,6,7,8,9};;
        System.out.println(linearsearch(arr, 5, 0));
        multioccurence(arr,6,0);
        System.out.println(list);
    }
    static boolean linearsearch(int[]arr,int target,int index){
        if (index==arr.length) {
            return false;
        }
        return arr[index]==target || linearsearch(arr, target, index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void multioccurence(int[]arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
         multioccurence(arr,target,index+1);
        
    }
}
