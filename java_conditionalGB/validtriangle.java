import java.util.Scanner;

public class validtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle 1: ");
        int a = sc.nextInt();
        System.out.print("Enter angle 2: ");
        int b = sc.nextInt();
        System.out.print("Enter angle 3: ");
        int c = sc.nextInt();
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
        sc.close();
    }
}
