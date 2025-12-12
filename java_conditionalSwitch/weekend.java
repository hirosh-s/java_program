import java.util.Scanner;

public class weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Invalid day number");
        } 
        else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } 
        else {
            System.out.println("Weekday");
        }
        sc.close();
    }
}
