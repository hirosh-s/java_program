import java.util.Scanner;

public class ArmstrongTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            int temp = i;
            int dig = 0;
            while(temp != 0){
                temp /= 10;
                dig ++;
            }
            int n = i;
            int sum = 0;
            while (n != 0){
                int last = n % 10;
                sum += (int) Math.pow(last,dig);
                n /= 10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
        return;
    }
}
