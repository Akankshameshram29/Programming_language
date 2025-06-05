package Sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int [] arr={3,5,1,4,2,6};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void quick(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
         int start = low;
         int end = high;
         int mid = start+ ((end-start)/2);
         int pivot = arr[mid];
         while(start<=end){
            while (arr[start]<pivot) {
                start++;
            }
            while (arr[end]>pivot) {
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
        }
        quick(arr, low, end);
        quick(arr, start, high);

     }
}
