import java.util.Scanner;

public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
