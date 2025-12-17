import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("No");
            return;
        }
        int a = num;
        int sum = 0;
        int digits = 0;
        while (a != 0){
            digits ++;
            a /= 10;
        }
        int n = num;
        while(n != 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if(sum == num){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
