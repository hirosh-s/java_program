import java.util.Scanner;

public class hundredmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000; 
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Error: Insufficient Balance!");
        }
        else if (amount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of 100!");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: ₹" + balance);
        }
        sc.close();
    }
}
