import java.util.Scanner;

public class right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        int hyp, x, y;
        if (a >= b && a >= c) {
            hyp = a;
            x = b;
            y = c;
        } else if (b >= a && b >= c) {
            hyp = b;
            x = a;
            y = c;
        } else {
            hyp = c;
            x = a;
            y = b;
        }
        if (hyp * hyp == x * x + y * y) {
            System.out.println("Right-Angled Triangle");
        } else {
            System.out.println("Not a Right-Angled Triangle");
        }
        sc.close();
    }
}
