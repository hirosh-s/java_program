import java.util.Scanner;

public class SumPosSkipNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (count < n) {
            int num = sc.nextInt();
            if (num < 0)
                continue;
            sum += num;
            count++;
        }
        System.out.println("Sum = " + sum);
    }
}
