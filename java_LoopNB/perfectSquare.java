import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0){
            System.out.println("no");
            return;
        }
        for(int i= 1; i <= n; i++){
            if(i * i == n){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("No");
    }
}
