class Solution {
    public int maxArea(int[] height) {
        var left = 0;
        var right = height.length - 1;
        int area = 0;
        int temp;

        while (left < right) {
            temp = (right - left) * Math.min(height[left], height[right]);

            if (temp > area)
                area = temp;

//            area = Math.max(((right - left) * Math.min(height[left], height[right])),area);  // you can use this line instead of upper lines

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }
}