import java.util.Scanner;

public class eveOddMix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        boolean hasEven = false;
        boolean hasOdd = false;
        if (num == 0) {
            System.out.println("All digits are even");
            return;
        }
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                hasEven = true;
            else
                hasOdd = true;
            num /= 10;
        }
        if (hasEven && hasOdd)
            System.out.println("Mixed digits");
        else if (hasEven)
            System.out.println("All digits are even");
        else
            System.out.println("All digits are odd");
    }
}
