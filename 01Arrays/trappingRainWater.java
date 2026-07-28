public class trappingRainWater {

    public static int trapRainWater(int[] arr) {
        int[] leftBound = new int[arr.length];
        leftBound[0] = arr[0];
        for(int i=1;i<arr.length;i++) {
            leftBound[i] = Math.max(arr[i],leftBound[i-1]);
        }
        int[] rightBound = new int[arr.length];
        rightBound[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--) {
            rightBound[i] = Math.max(arr[i], rightBound[i+1]);
        }
        printArr(leftBound);
        printArr(rightBound);
        int trappedWater = 0;
        for(int i=0;i<arr.length;i++) {
            int bound = Math.min(leftBound[i],rightBound[i]);
            trappedWater += bound-arr[i];
        }
        return trappedWater;
    }

    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={4,2,0,6,3,2,5};
        System.out.println("Total water trapped is "+trapRainWater(arr));
    }
}
