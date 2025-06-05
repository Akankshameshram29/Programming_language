package BinarySearchIn2dArray;

class SortedMatrix {
     public static void main(String[] args) {
        
    }

    static int[] Binarysearch(int [][] matrix,int row,int cStarts, int cEnds,int target){
        while(cStarts<=cEnds){
            int mid = cStarts +(cEnds-cStarts)/2;
            if(matrix[row][mid]==target){
                return new int []{row,mid};
            }
            if(matrix[row][mid]<target){
                cStarts = mid+1;
            }else{
                cEnds=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int [][] matrix, int target){
        int rows =matrix.length;
        int cols = matrix[0].length; 
        int rstart =0;
        int rEnds = 

        if(rows==1){
           return Binarysearch(matrix, 0, 0, cols-1, target);
        }
        while(row)
    }
}
