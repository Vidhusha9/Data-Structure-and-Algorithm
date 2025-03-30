package SelectionSort;

public class eCommerceSelectionSort {
    private long[] a;
    private int nElems;

    public eCommerceSelectionSort(int max){
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

    public void selectionSort(){
        for (int i = 0; i < nElems - 1; i++){
            int min_idx = i;

            for (int j = i + 1; j < nElems; j++){
                if (a[j] < a[min_idx]){
                    min_idx = j;
                }
            }
            long temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        eCommerceSelectionSort arr = new eCommerceSelectionSort(12);

        arr.insert(1200);
        arr.insert(850);
        arr.insert(1999);
        arr.insert(750);
        arr.insert(1600);
        arr.insert(950);
        arr.insert(650);
        arr.insert(1800);
        arr.insert(2200);
        arr.insert(1050);
        arr.insert(1400);
        arr.insert(1750);

        System.out.println("Before Sorting:");
        arr.display();

        arr.selectionSort();

        System.out.println("After Sorting:");
        arr.display();
    }
}
