import java.util.*;

public class maxWater {

    // Brute Force
    public static int maxwater(List<Integer> height) {
        int water = 0;
        for(int i=0;i<height.size();i++) {
            for(int j=i+1;j<height.size();j++) {
                int ht = Math.min(height.get(i),height.get(j));
                int wt = j-i;
                water = Math.max(water,ht*wt);
            }
        }
        return water;
    }

    public static int water(List<Integer> height) {
        int water = 0;
        int left = 0;
        int right = height.size()-1;
        while(left<right) {
            int wt = right - left;
            int ht = Math.min(height.get(left), height.get(right));
            water = Math.max(water, ht*wt);
            if(height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(4);
        height.add(7);
        height.add(3);
        height.add(7);
        height.add(9);
        height.add(5);
        System.out.println(water(height));
    }
}
