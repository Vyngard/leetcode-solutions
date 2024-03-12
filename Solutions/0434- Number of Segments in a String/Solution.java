class Solution {
    public int countSegments(String s) {
                String[] arr = s.split(" ");
        int size = 0;
        for (String item : arr) {
            if (!item.isEmpty())
                size++;
        }
        
        return size;
    }
}