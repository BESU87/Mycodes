public class lastAndFirstDsum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits " + sumFirstAndLastDigit(101));

    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int middle = 0;
        int lastDigit = 0;
        int sum = 0;

        if (number < 9) {
            number *= 2;
            return number;
        }
        while (number > 9) {

            firstDigit = number % 10;
            number = number / 10;

            while (number > 9) {
                middle = number % 10;
                number = number / 10;
            }
        }

        lastDigit = number;
        sum = firstDigit + lastDigit;
        if (sum >= 0)
            return sum;
        else
            return -1;

    }

}
