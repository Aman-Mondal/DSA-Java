public class subset {

    public static void subSet(String str, String ans, int l) {
        if(l==str.length()) {
            System.out.print(ans+" ");
            return;
        }
        subSet(str, ans+str.charAt(l), l+1);
        subSet(str, ans, l+1);
    }

    public static void main(String[] args) {
        String str = "porsche";
        subSet(str, "", 0);
    }    
}
