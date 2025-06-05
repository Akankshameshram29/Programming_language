
//find peak element
public class MountainArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2,1};
        int result = peakvalueIndex(nums);
        System.out.println(result);
    }
    public static int peakvalueIndex(int [] nums){
        int start = 0;
       int end = nums.length -1;
       
       while (start<end) {
        int mid = start +(end - start)/2;
        if (nums[mid]>nums[mid+1]){
           end = mid;
        }
        else{
            start = mid +1;
        }
       }
       return start;
    }

}
