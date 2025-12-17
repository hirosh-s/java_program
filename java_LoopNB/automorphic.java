import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        boolean isAutomorphic = true;
        while (n != 0 ){
            if(square % 10 != n % 10){
                isAutomorphic = false;
                break;
            }
            n /= 10;
            square /= 10;
        }
        if(isAutomorphic)
            System.out.println("Automorphic");
        else
            System.out.println("not Automorphic");
    }
}
