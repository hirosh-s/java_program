import java.util.Scanner;

public class eekndTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int price;
        if (day >= 1 && day <= 5) {
            price = 100;
            System.out.println("Weekday Ticket Price: ₹" + price);
        }
        else if (day == 6 || day == 7) {
            price = 150;
            System.out.println("Weekend Ticket Price: ₹" + price);
        }
        else {
            System.out.println("Invalid Day Number");
        }
        sc.close();
    }
}