public class FindMountainArray {
        

        static int Search (int[] arr,int target){
             int peak = peakvalueIndex(arr);
             int firstTry = binarySearch(arr, target, 0, peak);
             if (firstTry != -1){
                return firstTry;
             }
            return binarySearch(arr, target, target, firstTry);
        }
    
        public static int peakvalueIndex(int [] arr){
            int start = 0;
           int end = arr.length -1;
           
           while (start<=end) {
            int mid = start +(end - start)/2;
            if (arr[mid]>arr[mid+1]){
               end = mid;
            }
            else{
                start = mid +1;
            }
           }
           return start;
        }
    
        static int binarySearch(int[] arr,int target, int start,int end){
            boolean isAsc = arr[start]<arr[end];

            while (start<=end) {
                int mid = start +(end - start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid +1;
                    }
                }else{
                    if(target>arr[mid]){
                        end = mid -1;
                    }else{
                        start = mid +1;
                    }
                }
           }
           return -1;
       }
    
    
}
