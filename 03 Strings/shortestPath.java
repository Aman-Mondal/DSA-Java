public class shortestPath {

    public static float shortest(String path) {
        int x=0, y=0;
        for(int i=0;i<path.length();i++) {
            if(path.charAt(i)=='E') {
                x++;
            } else if (path.charAt(i)=='N') {
                y++;
            } else if (path.charAt(i)=='S') {
                y--;
            } else {
                x--;
            }
        }
        // for shortest path we will find displacement disp = root(x^2 + y^2)
        int x2 = x*x;
        int y2 = y*y;
        float disp = (float)Math.sqrt(x2+y2);
        return disp;
    }

    public static void main(String[] args) {
        String path = "NENENENENE";
        System.out.println("Shoetest path is "+shortest(path));

    }
}
