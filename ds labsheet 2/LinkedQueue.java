public class LinkedQueue {
    // Inner Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Insert an element at the rear of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Enqueued: " + value);
    }

    // Remove and return the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Queue is empty");
            return -1;
        }

        int removedData = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return removedData;
    }

    // Retrieve the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Return the total number of elements
    public int getSize() {
        return size;
    }

    // Print all elements from front to rear using `temp`
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Front -> ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("<- Rear");
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Front -> 10 20 30 <- Rear

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front item: " + queue.peek());   // 20
        queue.display(); // Front -> 20 30 <- Rear

        queue.enqueue(40);
        queue.enqueue(50);
        queue.display(); // Front -> 20 30 40 50 <- Rear

        System.out.println("Queue size: " + queue.getSize()); // 4
    }
}