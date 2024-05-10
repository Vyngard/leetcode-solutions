class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Double> list = new ArrayList<>();
        Map<Double, int[]> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add((double) arr[i] / arr[j]);
                map.put((double) arr[i] / arr[j], new int[]{i,j});
            }
        }

        Collections.sort(list);

        int[] indexes = map.get(list.get(k-1));
        return new int[]{arr[indexes[0]],arr[indexes[1]]};
    }
}