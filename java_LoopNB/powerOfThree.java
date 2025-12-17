import java.util.Scanner;

public class powerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("no");
            return;
        }
        while (n % 3 == 0){
            n /= 3;
        }
        if(n == 1)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
