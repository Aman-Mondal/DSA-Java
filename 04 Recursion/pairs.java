import java.util.Scanner;

public class pairs {

    public static int ways(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // ways if stays single
        int single = ways(n - 1);

        // ways if pairs
        int pair = (n - 1) * ways(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        System.out.print(
                "Given n number of people and one can either form a pair or stau single what are the total number of possibility\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of peoble : ");
        int n = sc.nextInt();
        System.out.println("Total number of ways are : "+ways(n));
        sc.close();
    }
}
