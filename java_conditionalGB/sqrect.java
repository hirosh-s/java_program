import java.util.Scanner;

public class sqrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        System.out.print("Enter side 4: ");
        int d = sc.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("Square");
        }
        else if (a == c && b == d || a == b && c == d || a == d && b == c) {
            System.out.println("Rectangle");
        }
        else {
            System.out.println("Neither Square nor Rectangle");
        }
        sc.close();
    }
}
