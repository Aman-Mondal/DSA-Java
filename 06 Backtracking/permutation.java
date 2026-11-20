public class permutation {

    public static void findPermut(String str, String ans) {
        if(str.length()==0) {
            System.out.print(ans+" ");
        }
        for(int i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermut(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "cyan";
        findPermut(str, "");
    }
}
