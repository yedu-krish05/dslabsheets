class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 
public class stackusinglinked {
    private Node top;
    private int size;
    
    public stackusinglinked() {
        this.top = null;
        this.size = 0;
    }
    
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data + "pushed to stack");
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow The stack is empty");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        size--;
        return poppedValue;
    }
    
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public int size() {
        return size;
    }
    
    public static void main (String[] args) {
        stackusinglinked s = new stackusinglinked();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element peek:" + s.peek());
        System.out.println("Current stack size:" + s.size());
        System.out.println("Popped element:" + s.pop());
        System.out.println("Popped element:" + s.pop());
        System.out.println("is stack empty:" + s.isEmpty());
        System.out.println("Popped element:" + s.pop());
        System.out.println("is stack empty:" + s.isEmpty());
    }
}