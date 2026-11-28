import java.util.*;

public class stackAL {
    static class StackArrayList {
        static ArrayList<Integer> stack = new ArrayList<>();
        public static boolean isEmpty() {
            return stack.size()==0;
        }
        public static void push(int data) {
            stack.add(data);
        }
        public static int pop() {
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }
        public static int peek() {
            return stack.get(stack.size()-1);
        }
    }
    public static void main(String[] args) {
        StackArrayList S = new StackArrayList();
        S.push(10);
        S.push(5);
        while(!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}
