package practice;

public class KthElement {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 5, 6, 2};
        int k = 3;
        int ans = quickSelect(arr, 0, arr.length - 1, k - 1);
        System.out.println("The " + k + "rd smallest element is: " + ans);
    }

    static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int partitionIndex = partition(arr, low, high);
            
            if (partitionIndex == k) {
                return arr[partitionIndex];
            } else if (partitionIndex > k) {
                return quickSelect(arr, low, partitionIndex - 1, k);
            } else {
                return quickSelect(arr, partitionIndex + 1, high, k);
            }
        }
        return -1; // In case of invalid k
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int start = low;
        int end = high;

        while (start < end) {
            while (start < high && arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, low, end); // Place pivot in correct position
        return end;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

               


