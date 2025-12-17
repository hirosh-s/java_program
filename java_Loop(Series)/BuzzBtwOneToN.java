import java.util.Scanner;

public class BuzzBtwOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int ld = i % 10;
            if (ld == 7 || i % 7 == 0){
                System.out.println(i+" ");
            }
        }
        return;
    }
}
