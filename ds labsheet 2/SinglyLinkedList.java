import java.util.Scanner;

class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;

    // a) Insert at beginning
    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted at beginning.");
    }

    // b) Insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node inserted at end.");
    }

    // c) Insert between two nodes
    void insertBetween(int data, int position) {
        if (position == 1) {
            insertBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Node inserted at position " + position);
    }

    // d & g) Delete from beginning
    void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        System.out.println("Node deleted from beginning.");
    }

    // e) Delete from end
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        System.out.println("Node deleted from end.");
    }

    // f) Delete node at 3rd position
    void deleteThird() {
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("Less than 3 nodes in the list.");
            return;
        }
        head.next.next = head.next.next.next;
        System.out.println("3rd node deleted.");
    }

    // h) Display
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // i) Search
    void search(int value) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Element found at position " + position);
                return;
            }
            temp = temp.next;
            position++;
        }
        System.out.println("Element not found.");
    }

    // Main method (Menu Driven)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice;
        int data;
        int position;
        int value;

        do {
            System.out.println("\n===== SINGLY LINKED LIST =====");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert Between Two Nodes");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete 3rd Node");
            System.out.println("7. Display List");
            System.out.println("8. Search");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertBeginning(data);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertEnd(data);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    position = sc.nextInt();
                    list.insertBetween(data, position);
                    break;
                case 4:
                    list.deleteBeginning();
                    break;
                case 5:
                    list.deleteEnd();
                    break;
                case 6:
                    list.deleteThird();
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    list.search(value);
                    break;
                case 9:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
        sc.close();
    }
}