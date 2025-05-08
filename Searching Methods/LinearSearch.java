package LinearSearch;

public class LinearSearch {
    public static int lSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {12, 25, 36, 45, 60};
        int target = 35;

        int result = lSearch(array, target);

        if (result != -1) {
            System.out.println("The number found at index: " + result);
        } else {
            System.out.println("The number not found.");
        }
    }
}
