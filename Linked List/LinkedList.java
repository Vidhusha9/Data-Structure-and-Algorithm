package LinkenList;

public class LinkedList {
    private Node head;
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtTail(int data) {
        // checks if the linked list is already empty or not
        if (head == null) {
            head = new Node(data);
            return;
        }
        //creating a temporary node to traverse through the array
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
    }

    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            head = new Node(data, head); // insert at the head
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtIndex(1, 15);  // Insert 15 at index 1

        list.display();  // Output: 10 15 20 30
    }
}