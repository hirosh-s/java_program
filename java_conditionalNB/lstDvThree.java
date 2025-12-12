import java.util.Scanner;

public class lstDvThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 10;
        if(b % 3 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
