public class salaryCalc {
    public static void main(String[] args) {
        double basic = 20000;
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double total = basic + hra + da;
        System.out.println(total);
    }
}
