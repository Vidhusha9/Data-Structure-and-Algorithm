package Stacks;

public class BrowserHistorySystem {
    private int maxSize;
    private int[] stackData;
    private int top;

    public BrowserHistorySystem(int s){
        this.maxSize = s;
        this.stackData = new int[maxSize];
        this.top = -1;
    }

    public void push(int j){
        if (isFull()){
            throw new IllegalStateException("History is full! Cannot visit page " + j);
        }
        stackData[++top] = j;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("History is clear.");
            return -1;
        }
        return stackData[top--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("History is clear.");
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
            System.out.println("There are no any exist page.");
        }
        for (int i = 0; i <= top; i++){
            System.out.print(stackData[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BrowserHistorySystem stack = new BrowserHistorySystem(5);

        stack.push(101);
        stack.push(102);
        stack.push(103);
        stack.push(104);
        stack.push(105);

        System.out.print("Browser History: ");
        stack.display();

        try {
            stack.push(106); // This will throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Current Page: " + stack.peek());

        System.out.println("Going back...");
        System.out.println("Popped: " + stack.peek());
        stack.pop();
        System.out.print("Update History: ");
        stack.display();
        System.out.println("Current Page: " + stack.peek());
    }

}
