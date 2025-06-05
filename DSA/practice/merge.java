package practice;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int [] arr1={1,3,5,7};
        int [] arr2={2,4,6,8};
        int [] ans = merge1(arr1, arr2);
        System.out.println(Arrays.toString(ans));

        int [] array = {10,7,8,9,1,5};
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));

        int [] num = {12,11,13,5,6,7};
        num = mergeSort(num);
        System.out.println(Arrays.toString(num));

    }
    
     static int [] mergeSort(int []arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        
        return merge1(left,right);
    }
    static int [] merge1(int []left,int [] right){
        int [] ans= new int [left.length + right.length];
        int i =0;
        int j =0;
        int k=0;
        
       while(i<left.length && j<right.length){
        if(left[i]<right[j]){
            ans[k]=left[i];
            i++;
        }
        else{
           ans[k]=right[j];
           j++;
        }
        k++;
       }

       while (i<left.length) {
        ans[k]=left[i];
        i++;
        k++;
       }
       while (j<right.length) {
        ans[k]=right[j];
        j++;
        k++;
       }
       return ans;
    }
           
}
