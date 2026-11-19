// Search in Roated Sorted Array

import java.util.Scanner;

public class rotSortSrch {
    public static int search(int[] arr, int start, int key, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[start] <= arr[mid]) { // This if block make sure we always perform search in a sorted array
            if (arr[start] <= key && key <= arr[mid]) {
                return search(arr, start, key, mid - 1);
            } else {
                return search(arr, mid + 1, key, end);
            }
        } else {
            if (arr[mid] <= key && key <= arr[end]) {
                return search(arr, mid + 1, key, end);
            } else {
                return search(arr, start, key, mid - 1);
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 18, 20, 27, 33, 60, 10, 15, 16 }; // Rotated Sorted array
        System.out.print("The Rotated Sorted Array is : ");
        printArr(arr);
        System.out.print("\nEnter key to be searched : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int idx = search(arr, 0, key, arr.length - 1);
        if (idx > -1) {
            System.out.println(key + " is present at index " + idx);
        } else {
            System.out.println("Key not Present!");
        }
        sc.close();
    }
}
