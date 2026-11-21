public class sqrt {
    public static int sqroot(int n, int start, int end) {
        int ans = 0;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if((long)mid*mid==n) {
                return mid;
            }
            if(n<(long)mid*mid) {
                end = mid-1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static int mySqrt(int x) {
        return (int) sqroot(x, 0, x);
    }

    public static void main(String[] args) {
        int n = 2147395599;
        System.out.println(mySqrt(n));
    }
}
