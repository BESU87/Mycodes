public class AllFactors {

    public static void main(String[] args) {
        printFactors(2);
    }

    public static void printFactors(int num) {
        if (num < 0) {
            System.out.println("Invalid Value ");
        }
        for (int i = 1; i <= num; i++) {


            if ((num > 0) && (num % i == 0)) {
                System.out.println(" " + i);
            }


        }
    }

}
