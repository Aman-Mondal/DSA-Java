import java.util.Scanner;

public class occurance {
    public static int firstOccurance(int[] arr, int i, int key) {
        if(arr[i]==key) {
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }
    public static int lastOccurance(int[] arr, int i, int key) {
        if(arr[i]==key) {
            return i;
        }
        return lastOccurance(arr, i-1, key);
    }

    public static void main(String[] args) {
        int[] arr = {12,3,22,13,34,22,25,47,2,12,13};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Key to be searched : ");
        int key = sc.nextInt();
        sc.close();
        System.out.println("Position of First Occurance : "+firstOccurance(arr, 0, key));
        System.out.println("Position of Last Occurance : "+lastOccurance(arr, arr.length-1, key));
    }
}
