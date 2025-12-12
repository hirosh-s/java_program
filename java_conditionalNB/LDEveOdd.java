import java.util.Scanner;

public class LDEveOdd {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 10;
        if(b % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
