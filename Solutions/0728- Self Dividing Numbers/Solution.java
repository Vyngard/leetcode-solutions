class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int number = i;
            boolean selfDiving = true;
            
            while (number > 0) {
                int remainder = number % 10;
                if (remainder == 0 || i % remainder != 0) {
                    selfDiving = false;
                    break;
                }
                number /= 10;
            }
            if (selfDiving) {
                answer.add(i);
            }
        }
        
        return answer;

    }

}