import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        num = Math.abs(num);
        int lastDigit = num % 10;
        int firstDigit = num;
        int digits = 0;
        while (firstDigit >= 10) {
            firstDigit /= 10;
            digits++;
        }
        int power = (int) Math.pow(10, digits);
        int middle = (num % power) / 10;
        int swapped = lastDigit * power + middle * 10 + firstDigit;
        if (original < 0)
            swapped = -swapped;
        System.out.println(swapped);
    }
}
