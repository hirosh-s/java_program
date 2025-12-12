import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a/2*2;
        if(a == b){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
