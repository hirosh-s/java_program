import java.util.Scanner;

public class seniorbenif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 60)
            System.out.println("Eligible for benifit");
        else
            System.out.println("Not eligible for benifit");
    }
}
