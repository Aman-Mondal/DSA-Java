import java.util.*;

public class basicString {
    public static void main(String[] args) {
        char[] str = { 'A', 'l', 'p', 'h', 'a' };
        String str2 = "Alpha";
        String str3 = new String("Alpha");
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        // Here str is concatenated i.e Java converts the array using its default object
        // representation
        // [C means array of characters (char[]), and @55f96302 is a representation
        // based on the object's identity/hash code
        System.out.println(str + "\n" + str2 + "\n" + str3);

        // .next() only include first string and ignores rest after a space
        // System.out.print("Enter Name : ");
        // String name = sc.next();
        // System.out.println(name);

        // .nextLine() prints the whole string space included
        System.out.print("Enter Name : ");
        String name2 = sc.nextLine();
        System.out.println(name2);
        // sc.close();

        // Concatenate
        System.out.print("Enter Last Name : ");
        String lname = sc.next();
        System.out.print("Enter First Name : ");
        String fname = sc.next();
        String fullname = fname + " " + lname;
        System.out.println(fullname);
    }
}
