public class largetsString {
    public static void main(String[] args) {
        String[] pokken = { "Bulbasaur", "Charmander", "Squirtle" };
        String largest = pokken[0];
        for (int i = 1; i < pokken.length; i++) {
            if (largest.compareTo(pokken[i]) < 0) {
                largest = pokken[i];
            }
        }
        System.out.println(largest);
    }
}
