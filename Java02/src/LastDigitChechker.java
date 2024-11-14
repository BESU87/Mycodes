public class LastDigitChechker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(123, 45, 133));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        int compare = 0;
        int compare2 = 0;
        int compare3 = 0;

        if ((x > 9 && x < 1001) && (y > 9 && y < 1001) && (z > 9 && z < 1001)) {

            compare = x % 10;
            compare2 = y % 10;
            compare3 = z % 10;
        } else {
            return false;
        }


        return compare == compare2 || compare == compare3 || compare3 == compare2;
    }

    public static boolean isValid(int num) {
        return num > 9 && num < 1001;

    }
}
