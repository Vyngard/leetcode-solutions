class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : arr) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }

        for (String item : arr) {
            if (map.get(item) == 1) {
                if (k == 1) {
                    return item;
                } else {
                    k--;
                }
            }
        }

        return "";
    }
}