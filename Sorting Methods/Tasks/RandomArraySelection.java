package SelectionSort;

import java.util.Random;

public class RandomArraySelection {
    private long[] a;
    private int nElems;

    public RandomArraySelection(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        if (nElems < a.length) {
            a[nElems] = value;
            nElems++;
        } else {
            System.out.println("Array is full.");
        }
    }

    public void selectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < nElems; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            swap(i, min_idx);
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10000;
        RandomArraySelection arr = new RandomArraySelection(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr.insert(rand.nextInt(1000000) + 1);
        }

        System.out.println("Sorting started...");
        long startTime = System.nanoTime();
        arr.selectionSort();
        long endTime = System.nanoTime();

        System.out.println("Sorting completed in " + (endTime - startTime) / 1_000_000.0 + " ms");

        arr.insert(500000);
    }
}
