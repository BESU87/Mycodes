public class shareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(10, 23));

    }

    public static boolean hasSharedDigit(int x, int y) {
        int c = 0;
        int d = 0;
        int f = 0;
        int g = 0;

        if ((x > 9 && x < 100) && (y > 9 && y < 100)) {

            c = x % 10;
            d = x / 10;
            f = y % 10;
            g = y / 10;
        } else {
            return false;
        }
        return c == f || c == g || d == f || d == g;
    }
}
