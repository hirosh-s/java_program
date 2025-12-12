import java.util.Scanner;

public class tcktprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();
        int price;
        if (age <= 12) {
            price = 50;
            System.out.println("Child Ticket: ₹" + price);
        }
        else if (age < 60) {
            price = 100;
            System.out.println("Adult Ticket: ₹" + price);
        }
        else {
            price = 70;
            System.out.println("Senior Ticket: ₹" + price);
        }
        sc.close();
    }
}
