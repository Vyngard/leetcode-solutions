import java.util.Stack;

class MyQueue {
    Stack<Integer> main_stack;
    Stack<Integer> temp_stack;
    public MyQueue() {
        main_stack = new Stack<>();
        temp_stack = new Stack<>();
    }

    public void push(int x) {
        main_stack.push(x);
    }

    public int pop() {
        int size = main_stack.size();
        for (int i = 0; i < size - 1; i++) {
            temp_stack.push(main_stack.pop());
        }

        int number = main_stack.pop();

        size = temp_stack.size();
        for (int i = 0; i < size; i++) {
            main_stack.push(temp_stack.pop());
        }

        return number;
    }

    public int peek() {
        int size = main_stack.size();

        for (int i = 0; i < size - 1; i++) {
            temp_stack.push(main_stack.pop());
        }
        int number = main_stack.peek();

        size = temp_stack.size();
        
        for (int i = 0; i < size; i++) {
            main_stack.push(temp_stack.pop());
        }

        return number;
    }

    public boolean empty() {
        return main_stack.isEmpty();
    }
}