public class penDiscount {
    public static void main(String[] args) {
        int pens = 12;
        int pricePerPen = 10;
        int offerSets = pens / 5;
        int payablePens = offerSets * 3 + (pens % 5);
        int totalAmount = payablePens * pricePerPen;
        System.out.println(totalAmount);
    }
}
