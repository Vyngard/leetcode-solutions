class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int size = matrix[0].length;
        int count = 0;
        Set<Integer> mySet = new HashSet<>();
        List<Integer> answer = new ArrayList<>();

        for (int[] row : matrix) {
            int minElement = Integer.MAX_VALUE;
            for (int num : row) {
                if (num < minElement) {
                    minElement = num;
                }
            }
            mySet.add(minElement);
        }

        int maxNumber = -1;
        while (count < size) {
            for (int[] row : matrix) {
                if (row[count] > maxNumber) {
                    maxNumber = row[count];
                }
            }
            if (mySet.contains(maxNumber)) {
                answer.add(maxNumber);
            }
            count++;
            maxNumber = -1;
        }

        return answer;
    
    }
}