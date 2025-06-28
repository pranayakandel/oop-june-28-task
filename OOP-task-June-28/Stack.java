public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full.");
            return;
        }
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}