import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        if (rowIndex == 1)
            return list;

        while (rowIndex > 0) {
            ArrayList<Integer> temp = new ArrayList<>(list);
            list.clear();
            list.add(1);
            for (int i = 0; i < temp.size() - 1; i++) {
                list.add(temp.get(i) + temp.get(i+1));
            }
            list.add(1);
            rowIndex--;
        }
        return list;
    }
}