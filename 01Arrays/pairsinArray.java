public class pairsinArray {
    public static void pairs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {2,4,5,7,11,23,14,56};
        System.out.print("Pairs in above array : ");
        pairs(arr);
    }
}
