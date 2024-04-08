class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int top = 0;
        int index = 0;
        int n =  students.length;
        int mark = top;

        while (true) {

            if (students[top] == sandwiches[index]) {
                index++;
                students[top] = -1;
                mark = top;
                top++;
            } else {
                top++;
            }

            if (top == n)
                top = 0;

            if (top == mark || index == sandwiches.length)
                break;

        }

        int count = 0;
        for (int student: students) {
            if (student != -1)
                count++;
        }

        return count;

    }
}