import java.util.Scanner;

public class sameLD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lda = a % 10;
        int ldb= b % 10;
        if(lda == ldb){
            System.out.println("Same last digit");
        }
        else{
            System.out.println("Not Same last digit");
        }
    }
}
