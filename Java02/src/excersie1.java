import java.util.Scanner;

public class excersie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;
        while (true) {
            System.out.println(" Enter the numbers, or any characters to exit :");
            String nextNumber = scanner.nextLine();

            try {
                double validNumber = Double.parseDouble(nextNumber);

//When a valid number is parsed from the input, if loopCount is 0, it means that is the first valid number encountered.
// Therefore, this number should be assigned to both `` and max since there are no other numbers to compare it with yet.
                if (loopCount == 0 || validNumber < min) {
                    min = validNumber;
                }
                if (loopCount == 0 || validNumber > max) {
                    max = validNumber;
                }
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        System.out.println("max = " + max + " Min = " + min);
    }
}
