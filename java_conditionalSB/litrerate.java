import java.util.Scanner;

public class litrerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        double bill = 0;
        if (liters <= 1000) {
            bill = 0; 
        }
        else if (liters <= 3000) {
            int extra = liters - 1000;
            bill = (extra / 1000.0) * 5;
        }
        else {
            bill = 2 * 5;
            int extra = liters - 3000;
            bill += (extra / 1000.0) * 10;
        }
        System.out.println("Total Water Bill: ₹" + bill);
        sc.close();
    }
}
