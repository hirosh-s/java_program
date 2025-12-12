import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } 
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } 
            else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid Triangle");
        }
        sc.close();
    }
}
