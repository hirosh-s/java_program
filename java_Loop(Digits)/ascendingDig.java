import java.util.Scanner;

public class ascendingDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = 10;
        while(num != 0){
            int lastDg = num % 10;
            if (lastDg <= prev){
                prev = lastDg;
            }
            else{
                System.out.println("Not in ascending order");
                return;
            }
            num /= 10;
        }
        System.out.println("ascending order");
    }
}
