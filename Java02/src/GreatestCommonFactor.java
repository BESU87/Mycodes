public class GreatestCommonFactor {

    public static void main(String[] args) {
        int gcd;
        gcd = getGreatestCommonDivisor(12, 90);
        System.out.println(gcd);


    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;

        }

        // Use the Euclidean algorithm to find GCD
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
