public class kadane {

    public static int kadanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++) {
            currSum = currSum + arr[i];
            if(currSum<0) {
                currSum=0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr= {2,4,6,-3,-7,4,6};
        System.out.println(kadanes(arr));
    }
}
