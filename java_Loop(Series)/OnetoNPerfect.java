import java.util.Scanner;

public class OnetoNPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i < num; i++){
            int sum = 0;
            for(int j = i - 1; j >= 1; j--){
                if (i % j == 0)
                    sum += j;
            }
            if(sum == i)
                System.out.println(i+" ");
        }  
        return;      
    }
}
