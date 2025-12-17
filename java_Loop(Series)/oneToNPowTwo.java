import java.util.Scanner;

public class oneToNPowTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;
        while(power <= n){
            System.out.println(power + " ");
            power *= 2;
        }
    }
}
