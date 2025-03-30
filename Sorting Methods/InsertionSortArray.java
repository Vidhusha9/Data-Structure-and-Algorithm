package InsertionSort;

public class InsertionSortArray {
    private long[] a;
    private int nElems;

    public InsertionSortArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        if (nElems < a.length){
            a[nElems] = value;
            nElems++;
        }else {
            System.out.println("Array is full.");
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insertionSort(){
        for (int i = 0; i < nElems; i++){
            long key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSortArray arr = new InsertionSortArray(10);

        arr.insert(45);
        arr.insert(99);
        arr.insert(12);
        arr.insert(62);
        arr.insert(39);
        arr.insert(77);
        arr.insert(58);

        System.out.println("Before sorting:");
        arr.display();

        arr.insertionSort();

        System.out.println("Before sorting:");
        arr.display();
    }
}
