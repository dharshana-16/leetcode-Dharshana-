// Last updated: 11/08/2026, 16:00:56
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = getcolMax(matrix, j);
                }
            }
        }
        return matrix;
    }
    public int getcolMax(int[][]matrix, int col){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][col] > max) max = matrix[i][col];
        }
        return max;
    }
}