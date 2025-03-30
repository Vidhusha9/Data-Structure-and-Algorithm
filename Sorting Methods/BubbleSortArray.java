package BubbleSort;

public class BubbleSortArray {
    private long[] a;
    private int nElems;

    public BubbleSortArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        if (nElems < a.length) {  // Prevents out-of-bounds errors
            a[nElems] = value;
            nElems++;  // Correctly increment nElems
        } else {
            System.out.println("Array is full");
        }
    }

    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubblesort(){
        for(int i = 0; i < nElems - 1; i++){
            for(int j = 0; j < nElems - 1 - i; j++){
                if (a[j] > a[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSortArray arr = new BubbleSortArray(10);

        arr.insert(45);
        arr.insert(99);
        arr.insert(12);
        arr.insert(62);
        arr.insert(39);
        arr.insert(77);
        arr.insert(58);

        System.out.println("Before Sorting:");
        arr.display();

        arr.bubblesort();

        System.out.println("After Sorting:");
        arr.display();
    }
}
