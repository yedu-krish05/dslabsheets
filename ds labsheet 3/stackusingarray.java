
class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack (int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothng to pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top== -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class stackusingarray {
    public static void main(String[]args) {
        ArrayStack stack = new ArrayStack (3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty: " + stack.isEmpty());
        stack.pop();
    }
}