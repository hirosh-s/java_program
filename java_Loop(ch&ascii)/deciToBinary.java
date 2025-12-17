import java.util.Scanner;

public class deciToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(0);
            return;
        }
        int binary = 0;
        int place = 1;
        while (num > 0){
            int rem = num % 2;
            binary = binary + rem * place;
            place *= 10;
            num /= 2;
        }
        System.out.println(binary);
    }
}
