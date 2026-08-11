package Sorting;

// Generally used for sorting data if numbers present in large frequencies

public class counting {
    public static void countingSort(int[] arr) {
        // Finding the max range
        int biggest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(biggest<arr[i]) {
                biggest=arr[i];
            }
        }
        int[] freqArr = new int[biggest+1];
        for(int i=0;i<arr.length;i++) {
            freqArr[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<freqArr.length;i++){
            while(freqArr[i]>0) {
                arr[j] = i;
                j++;
                freqArr[i]--;
            }
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3,6,5,2,3,6,4,6,6,9,4,2,1 };
        countingSort(arr);
        printArr(arr);
    }
}
