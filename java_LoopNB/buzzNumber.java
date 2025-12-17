import java.util.Scanner;

public class buzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 7 == 0 || n % 10 == 7)
            System.out.println("Buzz number");
        else
            System.out.println("Not a Buzz number");
    }
}
