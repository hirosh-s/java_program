public class mangoesDiscount {
    public static void main(String[] args) {
        int mangoes = 10;
        int pricePerMango = 20;
        int free = mangoes / 4;
        int payableMangoes = mangoes - free;
        int totalAmount = payableMangoes * pricePerMango;
        System.out.println(totalAmount);
    }
}
