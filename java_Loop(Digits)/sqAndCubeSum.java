import java.util.Scanner;

public class sqAndCubeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int squareSum = 0;
        int cubeSum = 0;
        if (num == 0) {
            squareSum = 0;
            cubeSum = 0;
        }
        while (num != 0) {
            int digit = num % 10;
            squareSum += digit * digit;
            cubeSum += digit * digit * digit;
            num /= 10;
        }
        System.out.println("Sum of squares of digits = " + squareSum);
        System.out.println("Sum of cubes of digits = " + cubeSum);
    }
}
