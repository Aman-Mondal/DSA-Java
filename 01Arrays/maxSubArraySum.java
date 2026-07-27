public class maxSubArraySum {

    public static int subArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length;
        for (int i = start; i < end - 1; i++) {
            for (int j = i; j < end; j++) {
                int subSum = 0;
                for(int k=i;k<=j;k++) {
                    subSum+=arr[k];
                    if(subSum>maxSum) {
                        maxSum = subSum;
                    }
                }
            }
        }
        return maxSum;
    }

    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,10};
        System.out.println("Max Subarray sum is "+subArray(arr));
    }
}
