package Graph;

public class Floyd_Warshall {
    public void ShortestDistance(int [][]matrix){
        int n = matrix.length;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = Integer.MAX_VALUE;
                }
                if(i == j){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int k =0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    matrix[i][k] = Math.min(matrix[i][k], matrix[i][j] + matrix[j][k]);
                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == Integer.MAX_VALUE){
                    matrix[i][j] = -1;
                }
            }
        }
    }
}
