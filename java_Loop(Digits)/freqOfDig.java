import java.util.Scanner;

public class freqOfDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        if(num == 0){
            System.out.println("0 occurs 1 time.");
            return;
        }
        for(int i = 0; i <= 9; i++){
            int temp = num;
            int count = 0;
            while(temp != 0){
                int last = temp % 10;
                if (last == i)
                    count ++;
                temp /= 10;
            }
            if(count > 0)
                System.out.print(i+" occurs "+count+" times");
        }
    }
}
