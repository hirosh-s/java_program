import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int digit = sc.nextInt();
        int count = 0;
        while(num > 0){
            int lastDg = num % 10;
            if(lastDg == digit){
                count ++;
            }
            num /= 10;
        }
        if(count == 0)
            System.out.println("digit does not occur in number.");
        System.out.println(count);
    }
}
