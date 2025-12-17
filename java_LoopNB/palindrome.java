import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Not Palindrome");
            return;
        }
        int a = num;
        int rev = 0;
        while(a != 0){
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        if(rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
