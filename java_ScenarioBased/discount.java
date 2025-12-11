public class discount {
    public static void main(String[] args) {
        double price = 1000;
        double discount = 10;
        double finalPrice = price - (price * discount / 100);
        System.out.println(finalPrice);
    }
}
