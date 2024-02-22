class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] following = new int[n + 1]; // who I trust
        int[] follower = new int[n + 1]; // who trust me

        for (int[] item : trust) {
            following[item[0]]++;
            follower[item[1]]++;
        }
        
        for (int i = 1; i < follower.length; i++) {
            if (following[i] == 0 && follower[i] == n - 1)
                return i;
        }
        
        return -1;
    }
}