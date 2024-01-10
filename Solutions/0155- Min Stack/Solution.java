import java.util.Stack;

class MinStack {
    Stack<Integer> main_stack;
    Stack<Integer> min_stack;

    public MinStack() {
        main_stack = new Stack<>();
        min_stack = new Stack<>();
        min_stack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        main_stack.push(val);

        if (val <= min_stack.peek())
            min_stack.push(val);

    }

    public void pop() {
       int number = main_stack.pop();

       if (number == min_stack.peek())
           min_stack.pop();
    }

    public int top() {
        return main_stack.peek();

    }

    public int getMin() {
        return min_stack.peek();
    }
}