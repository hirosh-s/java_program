import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if (speed > 100) {
            System.out.println("over speed");
        } else {
            System.out.println("normal speed");
        }
        sc.close();
    }
}
