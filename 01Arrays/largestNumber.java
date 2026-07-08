import java.util.*;

public class largestNumber {

    public static int largestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Eneter elements : ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest number in the array is : " + largestNum(arr));
    }
}
