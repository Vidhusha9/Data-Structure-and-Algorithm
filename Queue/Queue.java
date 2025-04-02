public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nElems;

    public Queue(int max) {
        this.maxSize = max;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nElems = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = value;
        nElems++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nElems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nElems == 0);
    }

    public boolean isFull() {
        return (nElems == maxSize);
    }

    public int peek() {
        return queueArray[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        int count = 0;
        while (count < nElems) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);

        System.out.print("Enqueue: ");
        q.display();

        System.out.println("Dequeue: " + q.remove());
        System.out.println("Dequeue: " + q.remove());

        System.out.print("Remaining Queue: ");
        q.display();

        System.out.println("Front: " + q.peek());
    }
}