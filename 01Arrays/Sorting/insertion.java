package Sorting;

public class insertion {
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insert
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 21, 5, 34, 22, 15, 47, 29, 8 };
        insertionSort(arr);
        printArr(arr);
    }
}
