import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0){
            System.out.println("0");
        }
        else if (n == 1){
            System.out.println("1");
        }
        else{
            int a = 0, b = 1;
            for( int i = 2; i <=n; i++){
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
    }
    }
}
