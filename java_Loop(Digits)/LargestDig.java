import java.util.Scanner;

public class LargestDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int maxDigit = 0;
        if (num == 0) {
            maxDigit = 0;
        }
        while (num > 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }
        System.out.println("Largest digit = " + maxDigit);
    }
}
