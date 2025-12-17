import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            int mul = 1;
            for (int i = digit; i >= 1; i--){
                mul *= i;
            }
            sum += mul;
            n /= 10;
        }
        if (sum == num)
            System.out.println("Strong number");
        else
            System.out.println("Not a Strong number");
    }

}
