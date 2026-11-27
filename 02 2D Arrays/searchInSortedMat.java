import java.util.*;

public class searchInSortedMat {

    // Bruteforce TC : O(n^2)
    public static void search(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println(key + " fount at position ( " + i + ", " + j + " )");
                    return;
                }
            }
        }
        System.out.println("Key not present in Matrix!");
    }

    // Binary Search using top right element TC : O(m+n)
    public static void binarySearch(int[][] arr, int key) {
        int row = 0;
        int col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (key == arr[row][col]) {
                System.out.println(key + " fount at position ( " + row + ", " + col + " )");
                return;
            } else if (key > arr[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Key not Fount!");
    }

    // Binary Search using bottom left element TC : O(m+n)
    public static void binarySearch2(int[][] arr, int key) {
        int row = arr.length;
        int col = 0;
        while (row >=0 && col < arr[0].length) {
            if (key == arr[row][col]) {
                System.out.println(key + " fount at position ( " + row + ", " + col + " )");
                return;
            } else if (key > arr[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Key not Fount!");
    }

    // TC = O(log(m*n))
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 26, 29, 38, 49 },
                { 32, 38, 44, 50 } };
        System.out.print("Enter Key to be searched : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        // search(arr, key);
        binarySearch(arr, key);
        sc.close();
    }
}
