import java.util.Scanner;

public class firstDgOdEv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        while(num > 9){
            num /= 10;
        }
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
