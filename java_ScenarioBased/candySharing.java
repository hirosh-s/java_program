public class candySharing {
    public static void main(String[] args) {
        int candies = 50;
        int people = 7;
        int eachGets = candies / people;
        int remaining = candies % people;
        System.out.println(eachGets);
        System.out.println(remaining);
    }
}
