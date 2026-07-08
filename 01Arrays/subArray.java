public class subArray {
    public static void printSubarray(int[] arr) {
        for(int start = 0; start<arr.length; start++) {
            for(int end=start;end<arr.length;end++) {
                System.out.print("[");
                for(int i=start; i<=end;i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.print("], ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,21,24,6,78,5,43,64};
        printSubarray(arr);
    }
}
