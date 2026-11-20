import java.util.Scanner;

public class nQueen {
    public static int placeQueen(char[][] board, int row, int count) {
        if (row == board.length) {
            printBoard(board);
            return ++count;
        }

        // Here for loop is for column traversal
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                count = placeQueen(board, row + 1,count);
                board[row][i] = 'X';
            }
        }
        return count;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Queen already present in the Column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Queen already present diagonally
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Queen already present diagonally
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] arr) {
        System.out.println("        CHESS BOARD         ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of chessboard (must be greater than 3): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
        placeQueen(board, 0, 0);
        System.out.println("Total number of ways : "+placeQueen(board, 0, 0));
        sc.close();
    }
}
