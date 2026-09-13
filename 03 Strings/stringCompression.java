// Asked in Amazon
// TC = O(n) as we traverse the string only once despite the two loops

public class stringCompression {

    public static void compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int counter = 1;
            while (i < str.length() - 1 && ch == str.charAt(i+1)) {
                counter++;
                i++;
            }
            sb.append(ch);
            sb.append(counter);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "aaaabbbbcccccc";
        compress(str);
    }
}
