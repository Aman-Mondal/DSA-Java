import java.util.Scanner;

public class power {
    // This have TC=O(n)
    public static int pow(int n, int p) {
        if(p==0) {
            return 1;
        }
        return n * pow(n, p-1);
    }

    // Optimised TC=O(log n)
    public static int powOpt(int n, int p) {
        if(p==0) {
            return 1;
        }
        int powhalf = powOpt(n, p/2) * powOpt(n, p/2);
        if(p%2!=0) {
            return powhalf * n;
        }
        return powhalf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("Enter power : ");
        int p = sc.nextInt();
        sc.close();
        System.out.println(n+"^"+p+" : "+powOpt(n, p));
    }
}
