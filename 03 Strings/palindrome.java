import java.util.*;

public class palindrome {

    public static boolean palin(String str) {
        for (int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr String to check if Palindrome : ");
        String str = sc.next();
        if(palin(str)) {
            System.out.println(str + " is palindrome!");
        } else {
            System.out.println(str+" is not Palindrome");
        }
        sc.close();
    }
}
