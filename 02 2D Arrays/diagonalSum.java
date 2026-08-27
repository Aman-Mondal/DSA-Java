public class diagonalSum {

    // Bruteforce TC=O(n^2)
    public static int diagSum(int[][] arr) {
        int diagSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    diagSum += arr[i][j];
                } else if (i + j == arr.length - 1) {
                    diagSum += arr[i][j];
                }
            }
        }
        return diagSum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                           { 5, 6, 7, 8 },
                           { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };
        System.out.println(diagSum(matrix));

    }
}
