class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numrows = rowSum.length;
        int numcols = colSum.length;  // Fixed the typo here
        int[][] result = new int[numrows][numcols];
        
        for (int i = 0; i < numrows; i++) {
            for (int j = 0; j < numcols; j++) {  // Reset j in each iteration of the outer loop
                result[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= result[i][j];
                colSum[j] -= result[i][j];
            }
        }
        
        return result;
    }
}
