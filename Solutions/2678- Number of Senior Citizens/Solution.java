class Solution {
    public int countSeniors(String[] details) {
        int answer = 0;
        for (String item : details) {
            int age = Integer.parseInt(item.substring(11, 13));
            if (age > 60)
                answer++;
        }

        return answer;
        
    }
}