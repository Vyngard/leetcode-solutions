import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> main_queue;
    Queue<Integer> temp_queue;
    public MyStack() {
        main_queue = new LinkedList<>();
        temp_queue = new LinkedList<>();
    }

    public void push(int x) {
        main_queue.add(x);
    }

    public int pop() {
        var size = main_queue.size();

        for (int i = 0; i < size - 1; i++) {
            temp_queue.add(main_queue.remove());
        }
        var number = main_queue.remove();

        size = temp_queue.size();

        for (int i = 0; i < size; i++) {
            main_queue.add(temp_queue.remove());
        }

        return number;
    }

    public int top() {
        var size = main_queue.size();
        for (int i = 0; i < size - 1; i++) {
            temp_queue.add(main_queue.remove());
        }

        var number = main_queue.remove();

        temp_queue.add(number);

        size = temp_queue.size();

        for (int i = 0; i < size; i++) {
            main_queue.add(temp_queue.remove());
        }

        return number;
    }

    public boolean empty() {
        return main_queue.isEmpty();
    }
}