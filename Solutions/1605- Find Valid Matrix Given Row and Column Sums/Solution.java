class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] answer = new int[rowSum.length][colSum.length];


        for (int i = 0;i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                int minNumber = Math.min(rowSum[i], colSum[j]);
                answer[i][j] = minNumber;
                rowSum[i] -= minNumber;
                colSum[j] -= minNumber;
            }
        }
        
        return answer;


    }
}