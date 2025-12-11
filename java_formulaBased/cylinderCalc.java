public class cylinderCalc {
    public static void main(String[] args) {
        int r = 5;
        int h = 10;
        double surfaceArea = 2 * 3.14 * r * (r + h);
        double volume = 3.14 * r * r * h;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
