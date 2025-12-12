import java.util.Scanner;

public class posNegZero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("poitive");
        }
        else if (a < 0) {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
