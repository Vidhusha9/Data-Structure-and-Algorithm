package Stacks;

public class StackArray {
    private int maxSize;
    private int[] stackData;
    private int top;

    public StackArray(int s){
        this.maxSize = s;
        this.stackData = new int[maxSize];
        this.top = -1;
    }

    public void push(int j){
        if (isFull()){
            throw new IllegalStateException("Stack array is full. Cannot PUSH " +j);
        }
        stackData[++top] = j;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack array is empty. Cannot POP");
            return -1;
        }
        return stackData[top--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack array is empty. Cannot PEEK");
        }
        return stackData[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
        }
        for (int i = top; i >= 0; i--){
            System.out.print(stackData[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(6);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.display();

        try {
            stack.push(70); // This will throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();

        System.out.println("Peek: " + stack.peek());
        stack.display();
    }
}
