import java.util.*;

public class pairSum {

    public static boolean psum(List<Integer> arr, int target) {
        int start = 0;
        int end = arr.size()-1;
        while(start<end) {
            if(arr.get(start)+arr.get(end)==target) {
                return true;
            }
            if(arr.get(start)+arr.get(end)<target) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(11);
        arr.add(14);
        arr.add(17);
        System.out.println(psum(arr, 100));
    }
}
