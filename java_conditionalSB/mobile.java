import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        long num = sc.nextLong();
        if (num >= 1000000000L && num <= 9999999999L) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
