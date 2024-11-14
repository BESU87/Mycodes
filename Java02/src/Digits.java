//This code is about adding the digits of any number given
//And, the solutions are really amazing for learning the difference between for and while loop

public class Digits {

    public static void main(String[] args) {
        System.out.println("The digit sum for 12345 is " + sumDigits(12345));
        System.out.println("The digit sum for 126,574,345 is " + sumDigits(126574345));

    }


    public static int sumDigits(int numbers) {
        if (numbers < 0) {
            return -1;
        }
        int sum = 0;

        while (numbers > 9) {
            sum += (numbers % 10);
            numbers = numbers / 10;
        }
        sum += numbers;
        return sum;
    }
}

