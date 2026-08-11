// Last updated: 11/08/2026, 16:03:47
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transMatrix = new int [cols][rows];
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return transMatrix;
    }
}