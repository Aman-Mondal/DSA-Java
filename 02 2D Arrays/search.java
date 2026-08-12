public class search {
    public static boolean srch(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{12,14,17},{19,21,22}};
        int key = 4;
        if(srch(arr, key)) {
            System.out.println("Key is present in the 2D Array");
        } else {
            System.out.println("Key not found");
        }
    }
}
