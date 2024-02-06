import java.util.*;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> temp;
    int min;
    public MinStack() {
        stack = new Stack<>();
        temp = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        stack.add(val);

        if (temp.isEmpty() || val <= temp.peek())
            temp.add(val);
    }

    public void pop() {
        int number = stack.pop();

        if (number == temp.peek())
            temp.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return temp.peek();
    }

}