package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public int binarySearch(int[] arraySearch, int searchKey){
        int left = 0;
        int right = arraySearch.length - 1;

        while (left <= right){
        int mid = left + (right - left)/ 2;
            if (arraySearch[mid] == searchKey){
                return mid;
            } else if (arraySearch[mid] < searchKey) {
                 left = mid + 1;
            } else {
                 right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        BinarySearch arr = new BinarySearch();

        int[] arrayNum = {2, 4, 8, 16, 33, 45, 52, 61, 78, 95};

        System.out.print("Array: ");
        for (int element: arrayNum) {
            System.out.print(element + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want search for in the array: ");
        int searchKey = in.nextInt();
        in.close();

        int result = arr.binarySearch(arrayNum, searchKey);

        if (result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found at index: " + result);
    }
}
