class Solution {
    public int[] frequencySort(int[] nums) {
        int[] count = new int[201];
        List<Integer> numbers = new ArrayList<>();

        for (int num : nums) {
            int temp = num + 100;
            count[temp] += 1;
            numbers.add(temp);
        }

        numbers.sort((a, b) -> count[a] == count[b] ? b - a : count[a] - count[b]);

        int[] answer = new int[numbers.size()];
        int index = 0;
        for (int number : numbers) {
            answer[index] = number - 100;
            index++;
        }
        
        return answer;

    }
}