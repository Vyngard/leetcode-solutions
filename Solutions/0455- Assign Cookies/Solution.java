class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int answer = 0;
        int index1 = 0;
        int index2 = 0;

        while (index1 < g.length && index2 < s.length) {
            if (s[index2] >= g[index1]) {
                index1++;
                answer++;
            }
            index2++;
        }
        
        return answer;

    }
}