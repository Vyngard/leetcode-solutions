import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            temp.add(queue.remove());
        }

        int answer = queue.remove();

        while (!temp.isEmpty()) {
            queue.add(temp.remove());
        }

        return answer;
    }

    public int top() {
        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            temp.add(queue.remove());
        }

        int answer = queue.peek();
        temp.add(queue.remove());

        while (!temp.isEmpty()) {
            queue.add(temp.remove());
        }

        return answer;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}