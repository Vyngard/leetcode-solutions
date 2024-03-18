class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder temp = new StringBuilder();

        var current = head;

         while (current != null) {
             temp.append(current.val);
             current = current.next;
         }

         return Integer.parseInt(temp.toString(), 2);
    }
}