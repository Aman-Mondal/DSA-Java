public class reverseArray {

// with WHILE LOOP

    public static void reverseArr(int arr[]) {
        int start =0;
        int end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArr(arr);
    }

// With FOR LOOP

    // public static void reverseArr(int arr[]) {
    //     int size = arr.length;
    //     for (int i = 0; i < arr.length / 2; i++) {
    //         int temp = arr[i];
    //         arr[i] = arr[size-1];
    //         arr[size-1] = temp;
    //         size--;
    //     }
    //     printArr(arr);
    // }

    public static void printArr(int arr[]) {
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        reverseArr(arr);
    }
}
