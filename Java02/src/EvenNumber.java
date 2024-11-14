public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("The sum of even digits " + getEvenDigitSum(256387));

    }

    public static int getEvenDigitSum(int number) {
        int even = 0;
        int middle = 0;

        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            middle = number % 10;
            number = number / 10;
            if (middle % 2 == 0) {

                even += middle;
            }
        }
        return even;

    }
}
