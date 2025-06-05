import java.util.Scanner;
public class SearchInRange {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("enter arr");
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" enter target element");
        int target = sc.nextInt();
        System.out.println("enter range");
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        int result_index = search2(arr, target, start, end);
        System.out.print(result_index);
    }
    public static int search2(int[] arr, int target, int start,int end){
               for(int i=start;i<end;i++){
                if(target == arr[i]){
                   return i;
                }
            }
        return -1;
    }
}
