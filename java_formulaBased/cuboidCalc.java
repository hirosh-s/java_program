public class cuboidCalc {
    public static void main(String[] args) {
        int l = 10;
        int b = 5;
        int h = 4;
        int surfaceArea = 2 * (l*b + b*h + h*l);
        int volume = l * b * h;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }
}
