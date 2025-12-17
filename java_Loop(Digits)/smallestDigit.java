import java.util.Scanner;

public class smallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int minDigit = 10;
        if (num == 0) {
            minDigit = 0;
        }
        while (num > 0) {
            int digit = num % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            num /= 10;
        }
        System.out.println("Smallest digit = " + minDigit);
    }
}
