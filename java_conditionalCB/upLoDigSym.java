import java.util.Scanner;

public class upLoDigSym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("It is a lowercase character");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("It is a uppercase character");
        }
        else if(ch >= '0' && ch <= '9'){
            System.out.println("It is a digit");
        }
        else{
            System.out.println("it is a special character");
        }
    }
}
