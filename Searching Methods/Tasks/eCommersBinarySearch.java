package BinarySearch;

import javax.swing.*;
import java.util.Scanner;

public class eCommersBinarySearch {
    public int binarySearch(int[] priceList, int SearchPrice){
        int lowerPrice = 0;
        int higherPrice = priceList.length - 1;

        while(lowerPrice <= higherPrice){
            int middlePrice = lowerPrice + (higherPrice - lowerPrice) / 2;

            if (SearchPrice == priceList[middlePrice]){
                return middlePrice;
            } else if (SearchPrice > priceList[middlePrice]) {
                lowerPrice = middlePrice + 1;
            } else {
                higherPrice = middlePrice - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        eCommersBinarySearch arr = new eCommersBinarySearch();

        int[] priceList = {5, 12, 15, 20, 30, 45, 60, 75};

        System.out.print("Array: ");
        for (int element : priceList){
            System.out.print(element + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter price you want find in the price list: ");
        int SearchPrice = in.nextInt();

        int result = arr.binarySearch(priceList, SearchPrice);

        if(result != -1){
            System.out.println("Found at index: " + result);
        }else {
            System.out.println("Price is not found.");
        }
    }
}
