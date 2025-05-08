package LinkenList;

public class LLDeletion {
    private Node head;

    // Node class
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at the end (for testing)
    public void insertAtTail(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete a node with a specific value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value " + value + " not found.");
        } else {
            current.next = current.next.next;
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        LLDeletion list = new LLDeletion();

        // Add some nodes
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);

        System.out.println("Original list:");
        list.display();  // 10 20 30 40 50

        System.out.println("After deleting first node:");
        list.deleteFirst();
        list.display();  // 20 30 40 50

        System.out.println("After deleting last node:");
        list.deleteLast();
        list.display();  // 20 30 40

        System.out.println("After deleting node with value 30:");
        list.deleteByValue(30);
        list.display();  // 20 40
    }
}
