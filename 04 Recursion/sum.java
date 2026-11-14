import java.util.Scanner;

public class sum {
    public static int naturalSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + naturalSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(naturalSum(n));
    }
}
