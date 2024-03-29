import java.lang.reflect.Array;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {

    private ArrayList<Integer> array = new ArrayList<>();
    private HashMap<Integer, Integer> map = new HashMap<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        array.add(val);
        map.put(val, array.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastItem = array.getLast();

        map.put(lastItem, index);
        array.set(index, lastItem);
        array.removeLast();
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return array.get(random.nextInt(array.size()));
    }


}




