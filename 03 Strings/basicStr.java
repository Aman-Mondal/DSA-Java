public class basicStr {

    public static void strPrint(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "Alpha";
        strPrint(str);
    }
}
