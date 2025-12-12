import java.util.Scanner;

public class battery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if (battery == 100) {
            System.out.println("Battery Full");
        }
        else if (battery >= 50) {
            System.out.println("battery above half");
        }
        else if (battery < 50) {
            System.out.println("battery below half");
        }
        else {
            System.out.println("Low Battery");
        }
        sc.close();
    }
}
