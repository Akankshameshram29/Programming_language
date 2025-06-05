import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("enter elements in array");
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("enter target element");
        int target = sc.nextInt();
        int [] res = Binarysearch(nums, target);
        System.out.println("first and last position");
        for(int i =0;i<res.length;i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
   
    public static int [] Binarysearch(int[]nums,int target){
        int [] ans = {-1,-1};
        int start = search(nums,target, true);
        int end = search(nums,target, false);
        
        ans[0] = start;
        ans[1]=end;

        return ans;

    } 

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target>nums[mid]){
                start  = mid +1;
              }
              else if(target<nums[mid]){
                  end = mid -1;
              }
              else{
                ans = mid;
                if(findStartIndex == true){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
              }
        }
        return ans;
    }
}
