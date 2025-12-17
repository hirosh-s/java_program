import java.util.Scanner;

public class countBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ones = 0, zeros = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 1)
                ones++;
            else if (digit == 0)
                zeros++;
            num /= 10;
        }
        System.out.println("Number of 1s: " + ones);
        System.out.println("Number of 0s: " + zeros);
    }
}
