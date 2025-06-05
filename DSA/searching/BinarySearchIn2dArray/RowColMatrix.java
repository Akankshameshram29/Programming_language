package BinarySearchIn2dArray;
import java.util.Arrays;
import java.util.Scanner;


public class RowColMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int target = sc.nextInt();
        System.out.println(Arrays.toString(Search(matrix, target)));
        sc.close();
    }
    

    static int [] Search(int[][]matrix, int target){
        int row = 0;
        int col = matrix.length-1;

        while(row< matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
