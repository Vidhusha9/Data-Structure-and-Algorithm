package InsertionSort;

public class LibraryBookSorter {
    private long[] a;
    private int nElems;

    public LibraryBookSorter(int max){
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

    public void insertionSort(){
        for (int i = 0; i < a.length; i++) {
            long key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LibraryBookSorter arr = new LibraryBookSorter(6);

        arr.insert(1023);
        arr.insert(895);
        arr.insert(1201);
        arr.insert(543);
        arr.insert(764);
        arr.insert(980);

        System.out.println("");
        arr.display();

        arr.insertionSort();

        System.out.println("");
        arr.display();
    }
}
