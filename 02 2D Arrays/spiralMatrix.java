public class spiralMatrix {
    public static void spiral(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;

        while (startRow < endRow && startCol < endCol) {
            for (int j = startCol; j < endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(matrix[i][endCol - 1] + " ");
            }
            for (int j = endCol - 2; j >= startCol; j--) {
                System.out.print(matrix[endRow - 1][j] + " ");
            }
            for (int i = endRow - 2; i > startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiral(matrix);
    }
}
