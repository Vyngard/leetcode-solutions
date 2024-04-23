class Solution {
    public int[] constructRectangle(int area) {
        int mean = (int) Math.sqrt(area);

        while (area % mean != 0) {
            mean--;
        }

        
        return new int[] {area/mean, mean};
    }
}