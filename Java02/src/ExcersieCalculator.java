import java.util.Scanner;

public class ExcersieCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int counter = 1;
        while (true) {
            System.out.println(" Please inputs numbers here :");
            String num = scanner.nextLine();
            try {

                double nums = Double.parseDouble(num);
                sum += nums;
                counter++;

            } catch (NumberFormatException nfe) {
                System.out.println(" SUM = XX AVG =YY");
                break;
            }
        }
        avg = sum / counter;
        System.out.println("SUM = " + sum + "AVG = " + avg);


    }
}
