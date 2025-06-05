
//ceiling nuumber is the smallest number greater than the target
public class CeilingNumber {
    public static void main(String[] args) {
        int [] arr = {2,4,8,10,14,16,18};
        int target = 9;
        int result = ceilingnum(arr, target);
        System.out.println("Ceiling Number ="+result);
        
    }
    public static int ceilingnum(int[] arr, int target){
       int start = 0;
       int end = arr.length -1;
       
       while (start<=end) {
        int mid = start +(end - start)/2;
        if (target>arr[mid]){
          start  = mid +1;
        }
        else if(target<arr[mid]){
            end = mid -1;
        }
        else{
            return mid;
        }
    
       }
     return start;
        
    }
    
}
