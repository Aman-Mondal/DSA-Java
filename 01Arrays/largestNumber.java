// import java.util.*;

public class largestNumber {

    public static int largestNum(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,6,7,3,2,1};
        System.out.println("The largest number in the array is : "+largestNum(arr));
    }
}
