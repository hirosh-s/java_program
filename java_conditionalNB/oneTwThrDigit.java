import java.util.Scanner;

public class oneTwThrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 1 && a <= 9)
            System.out.println("One digit");
        else if(a >= 10 && a <= 99)
            System.out.println("Two digit");
        else if(a >= 100 && a <= 999)
            System.out.println("Three digit");
    }
}
