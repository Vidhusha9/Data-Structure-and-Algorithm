package Stacks;

public class RailwayTicketsCounter {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public RailwayTicketsCounter(int max) {
        maxSize = max;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (rear == maxSize - 1) {
            rear = -1; // wrap around
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0; // wrap around
        }
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.print("Empty");
            return;
        }
        int i = front;
        int count = 0;
        while (count < nItems) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
    }
}
