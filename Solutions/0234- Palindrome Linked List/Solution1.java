import java.util.ArrayList;

class Solution1 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<>();
        var current = head;

        while (current != null) {
            array.add(current.val);
            current = current.next;
        }

        int left = 0;
        int right = array.size() - 1;

        while (left < right) {
            if (array.get(left) != array.get(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}