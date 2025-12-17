import java.util.Scanner;

public class digitOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        while(num > 0){
            int lastDg = num % 10;
            if(lastDg == digit){
                System.out.println("yes");
                return;
            }
            num /= 10;
        }
        System.out.println("No");
    }
}
