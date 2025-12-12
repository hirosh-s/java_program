import java.util.Scanner;

public class disc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Amount: ");
        double amount = sc.nextDouble();
        double discountPercent;
        double discount;
        double finalAmount;
        if (amount >= 10000) {
            discountPercent = 30;
        }
        else if (amount >= 5000) {
            discountPercent = 20;
        }
        else if (amount >= 1000) {
            discountPercent = 10;
        }
        else {
            discountPercent = 5;
        }
        discount = (discountPercent / 100) * amount;
        finalAmount = amount - discount;
        System.out.println("Purchase Amount: ₹" + amount);
        System.out.println("Discount Applied: " + discountPercent + "%");
        System.out.println("Discount Amount: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
        sc.close();
    }
}
