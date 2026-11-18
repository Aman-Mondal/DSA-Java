import java.util.Scanner;

public class removeDuplicate {

    public static void remove(String str, int idx, StringBuilder newstr, boolean[] occured) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        if (occured[str.charAt(idx) - 'a'] == true) {
            remove(str, idx + 1, newstr, occured);
        } else {
            newstr.append(str.charAt(idx));
            occured[str.charAt(idx)-'a'] = true;
            remove(str, idx + 1, newstr, occured);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = sc.next();
        boolean[] arr = new boolean[26];
        System.out.print("Words with no duplicate letters : ");
        remove(str, 0, new StringBuilder(""), arr);
        sc.close();
    }
}
