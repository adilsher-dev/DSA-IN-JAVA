import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Push
    void push(int x) {
        stack.push(x);

        // Store minimum value
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop
    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        int x = stack.pop();

        // If removed element is minimum
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    // Top
    int top() {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    // Get minimum
    int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Minimum: " + s.getMin());

        s.pop();

        System.out.println("Minimum: " + s.getMin());
        System.out.println("Top: " + s.top());
    }
}