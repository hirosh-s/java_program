import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in °C: ");
        int temp = sc.nextInt();
        if (temp <= 15) {
            System.out.println("Cold");
        }
        else if (temp <= 25) {
            System.out.println("Pleasant");
        }
        else if (temp <= 35) {
            System.out.println("Hot");
        }
        else {
            System.out.println("Heatwave");
        }
        sc.close();
    }
}
