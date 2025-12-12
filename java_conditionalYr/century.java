import java.util.Scanner;

public class century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            System.out.println(year + "Century Year");
        } else {
            System.out.println(year + "NOT Century Year");
        }
        sc.close();
    }
}
