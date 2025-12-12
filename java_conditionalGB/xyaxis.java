import java.util.Scanner;

public class xyaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Point lies in Quadrant 1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Point lies in Quadrant 2");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Point lies in Quadrant 3");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Point lies in Quadrant 4");
        } 
        else if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        } 
        else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        } 
        else {
            System.out.println("Point lies on the X-axis");
        }
        sc.close();
    }
}
