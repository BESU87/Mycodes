import java.util.Scanner;

public class challenge {

    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (counter <= 5) {
            System.out.println("Enter num #" + counter + ":");
            String NextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(NextNumber);
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("The sum of the five numbers is: " + sum);
    }

}
