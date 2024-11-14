// The challenge is to test a number whether it is even or not
public class Jwhile {

    public static void main(String[] args) {

        int i = 5;
        int count = 0;

        while (i <= 20) {
            if (isEvenNumber(i)) {
                i++;
                System.out.println(i);
                count++;
            } else {
                if (count == 5)
                    break;
                i++;
            }

        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
