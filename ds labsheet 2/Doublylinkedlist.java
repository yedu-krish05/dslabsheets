class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Doublylinkedlist {

    // 1. INSERT AT HEAD
    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        return newNode;
    }

    // 2. INSERT AT TAIL
    public static Node insertAtTail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    // 3. INSERT AT SPECIFIC POSITION (1-based index)
    public static Node insertAtPosition(Node head, int data, int position) {
        if (position == 1) return insertAtHead(head, data);

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Insert position out of bounds!");
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;

        return head;
    }

    // 4. DELETE AT HEAD
    public static Node deleteHead(Node head) {
        if (head == null) return null;

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    // 5. DELETE AT TAIL
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }

    // 6. DELETE AT SPECIFIC POSITION (1-based index)
    public static Node deleteAtPosition(Node head, int position) {
        if (head == null) return null;
        if (position == 1) return deleteHead(head);

        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Delete position out of bounds!");
            return head;
        }

        // Unlink temp from both sides
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        return head;
    }

    // 7. PRINT FORWARD
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Node head = null;

        System.out.println("--- 1. Insert Operations ---");
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);
        head = insertAtTail(head, 40);
        head = insertAtPosition(head, 30, 3); // List: 10 <-> 20 <-> 30 <-> 40
        printList(head);

        System.out.println("\n--- 2. Delete Operations ---");
        head = deleteHead(head); // Deletes 10 -> List: 20 <-> 30 <-> 40
        System.out.print("After deleting head: ");
        printList(head);

        head = deleteTail(head); // Deletes 40 -> List: 20 <-> 30
        System.out.print("After deleting tail: ");
        printList(head);

        head = deleteAtPosition(head, 2); // Deletes 30 -> List: 20
        System.out.print("After deleting position 2: ");
        printList(head);
    }
}