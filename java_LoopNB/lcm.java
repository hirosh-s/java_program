import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Invalid input");
            return;
        }
        int max = (a > b)? a : b;
        int lcm = max;
        while (true){
            if(lcm % a == 0 && lcm % b == 0){
                break;
            }
            lcm ++;
        }
        System.out.println(lcm);
    }
}
