package Stacks;

public class RestaurentPlateSystem {
    private int maxSize;
    private int[] stackData;
    private int topPlate;

    public RestaurentPlateSystem(int size){
        this.maxSize = size;
        this.stackData = new int[maxSize];
        this.topPlate = -1;
    }

    public void push(int j){
        if (isFull()){
            throw new IllegalStateException("Stack is full! Cannot add plate " + j);
        }
        stackData[++topPlate] = j;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("There are no any plates.");
        }
        return stackData[topPlate--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("There are no any plates.");
        }
        return stackData[topPlate];
    }

    public boolean isEmpty(){
            return (topPlate == -1);
    }

    public boolean isFull(){
            return (topPlate == maxSize - 1);
    }

    public void display1(){
        if (isEmpty()){
            System.out.println();
        }
        for (int i = 0; i <= topPlate; i++){
            System.out.println("Added Plate " + stackData[i] + " ");
        }
        System.out.println();
    }

    public void display2(){
        if (isEmpty()){
            System.out.println();
        }
        for (int i = 0; i <= topPlate; i++){
            System.out.print("Plate " + stackData[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RestaurentPlateSystem stack = new RestaurentPlateSystem(5);

        stack.push(101);
        stack.push(102);
        stack.push(103);
        stack.push(104);
        stack.push(105);

        stack.display1();

        try {
            stack.push(106); // This will throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Current Stack: ");
        stack.display2();

        System.out.println("serving: Removed Plate " + stack.peek());
        stack.pop();

        System.out.print("Current Stack: ");
        stack.display2();

        System.out.println("Top Plate: Plate " + stack.peek());
    }
}
