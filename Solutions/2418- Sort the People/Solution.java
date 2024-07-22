class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> myMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            myMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] answer = new String[names.length];
        int counter = 0; 
        for (int i = heights.length - 1; i >= 0; i--) {
            answer[counter] = myMap.get(heights[i]);
            counter++;
        }
        
        return answer;
    }
}