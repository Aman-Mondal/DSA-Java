import java.util.Scanner;

public class tiling {
    public static int ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // If first tile placed vertically remaning length is n - 1
        int ver = n - 1;
        // if first tile placed horizontally remaning length is n - 2
        int hor = n - 2;
        int totalWays = ways(ver) + ways(hor);
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.print(
                "Give the floor of size 2 x n and each tile is 2 x 1, Total number of ways of tiling the floor\n");
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total number of ways of tiling the floor is " + ways(n));
        sc.close();
    }
}
