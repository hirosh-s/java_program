import java.util.Scanner;

public class remZero {
    public class RemoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int result = 0;
        int place = 1;
        if (num == 0) {
            System.out.println(0);
            return;
        }
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }
        System.out.println("Number after removing zeros = " + result);
    }
}
