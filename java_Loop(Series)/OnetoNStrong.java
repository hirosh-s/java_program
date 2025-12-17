import java.util.Scanner;

public class OnetoNStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            int n = i;
            int sum = 0;
            while (n != 0){
                int ld = n % 10;
                int fact = 1;
                for(int j = ld; j >= 1; j--){
                    fact *= j;
                }
                sum += fact;
                n /= 10;
            }
            if(sum == i)
                System.out.println(i+" ");
        }  
        return;      
    }
}
