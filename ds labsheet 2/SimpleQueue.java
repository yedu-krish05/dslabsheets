public class SimpleQueue {
    private int[] data;
    private int front;
    private int rear;
    private int capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    // Queue is full when rear reaches the last index
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Queue is empty when front has surpassed rear
    public boolean isEmpty() {
        return front > rear;
    }

    // Add item at the rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow: Cannot insert " + value);
            return;
        }
        rear++;
        data[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Remove item from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow: Queue is empty");
            return -1;
        }
        int removedItem = data[front];
        front++;
        return removedItem;
    }

    // View front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }

    // Display elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Front -> ");
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("<- Rear");
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display(); // Front -> 10 20 30 40 <- Rear

        System.out.println("Dequeued: " + q.dequeue()); // 10
        System.out.println("Dequeued: " + q.dequeue()); // 20
        q.display(); // Front -> 30 40 <- Rear

        // Demonstrating the non-circular linear queue limitation:
        // Even though 2 spots were freed at the front, rear is still at index 3
        q.enqueue(50); // Triggers Queue Overflow
    }
}