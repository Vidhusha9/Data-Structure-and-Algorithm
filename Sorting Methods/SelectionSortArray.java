package SelectionSort;

public class SelectionSortArray {
    private long[] a;
    private int nElems;

    public SelectionSortArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        if(nElems < a.length){
            a[nElems] = value;
            nElems++;
        }else{
            System.out.println("Array is full");
        }
    }

    private void display(){
        for(int i = 0; i < nElems; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void selectionSort(){
        for (int i = 0; i < nElems - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < nElems; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
        long temp = a[i];
        a[i] = a[min_idx];
        a[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSortArray arr =  new SelectionSortArray(10);

        arr.insert(45);
        arr.insert(99);
        arr.insert(12);
        arr.insert(62);
        arr.insert(39);
        arr.insert(77);
        arr.insert(58);

        System.out.println("Before sorting:");
        arr.display();

        arr.selectionSort();

        System.out.println("Before sorting:");
        arr.display();
    }
}
