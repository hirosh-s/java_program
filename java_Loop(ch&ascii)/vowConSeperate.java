public class vowConSeperate {
    public static void main(String[] args) {

        System.out.println("Vowels:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }

        System.out.println("\n\nConsonants:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.print(ch + " ");
            }
        }
    }
}
