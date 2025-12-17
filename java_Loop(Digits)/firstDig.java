import java.util.Scanner;

public class firstDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        while(num > 9){
            num /= 10;
        }
        System.out.println(num);
    }
}
