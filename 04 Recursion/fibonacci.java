import java.util.*;

public class fibonacci {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}
