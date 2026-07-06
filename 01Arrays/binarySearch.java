
// The pre requisite of this is that the array must be sorted 
import java.util.*;

public class binarySearch {

    public static int binarySrch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        if (key > arr[arr.length - 1] || key < arr[0]) {
            return -1;
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == key) {
                    return mid;
                }
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 11 to 20 :");
        int key = sc.nextInt();
        int arr[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int idx = binarySrch(arr, key);
        if (idx == -1) {
            System.out.println("Enter a valid key !");
        } else {
            System.out.println("The key is present at idx : " + idx);
        }
        sc.close();
    }
}
