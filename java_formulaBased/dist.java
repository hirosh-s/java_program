public class dist {
    public static void main(String[] args) {
        int x1 = 2, y1 = 3;
        int x2 = 6, y2 = 9;
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) +(y2 - y1) * (y2 - y1));
        System.out.println(distance);
    }
}
