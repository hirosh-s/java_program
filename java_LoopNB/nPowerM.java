import java.util.Scanner;

public class nPowerM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int power = 1;
        for (int i = 0; i < m; i++){
            power *= n;
        }
        System.out.println(power);
    }
}
