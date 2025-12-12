import java.util.Scanner;

public class threeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 99 && a < 1000){
            System.out.println("Three Digit.");
        }
        else{
            System.out.println("No");
        }
    }
}
