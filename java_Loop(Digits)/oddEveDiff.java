import java.util.Scanner;

public class oddEveDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int evenSum = 0;
        int oddSum = 0;
        if (num == 0) {
            System.out.println("Difference = 0");
            return;
        }
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            num /= 10;
        }
        int difference = evenSum - oddSum;
        System.out.println("Difference = " + difference);
    }
}
