import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a Harshad number");
            return;
        }
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (n % sum == 0)
            System.out.println("Harshad number");
        else
            System.out.println("Not a Harshad number");
    }
}
