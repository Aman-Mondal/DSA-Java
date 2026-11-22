import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Arcieous");
        list.add("Pickachu");
        System.out.println(list);
        list.set(0,"Alpha");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

    }   
}
