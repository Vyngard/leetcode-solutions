import java.util.Stack;

class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        int size = stack.size();

        for (int i = 0; i < size - 1; i++)
            temp.add(stack.pop());

        int number = stack.pop();

        while (!temp.isEmpty())
            stack.add(temp.pop());

        return number;
    }

    public int peek() {
        int size = stack.size();

        for (int i = 0; i < size - 1; i++)
            temp.add(stack.pop());

        int number = stack.peek();
        temp.add(stack.pop());

        while (!temp.isEmpty())
            stack.add(temp.pop());

        return number;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}