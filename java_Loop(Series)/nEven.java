import java.util.Scanner;

public class nEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 0;
        while (count < n) {
            System.out.print(i + " ");
            i += 2;
            count++;
        }
    }
}
