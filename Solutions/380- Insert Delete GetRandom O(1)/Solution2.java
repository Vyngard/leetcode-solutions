import java.util.ArrayList;
import java.util.Random;

class RandomizedSet {

    private ArrayList<Integer> array = new ArrayList<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (array.contains(val)) {
            return false;
        }

        array.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!array.contains(val)) {
            return false;
        }

        array.remove(array.indexOf(val));
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return array.get(random.nextInt(array.size()));
    }
}