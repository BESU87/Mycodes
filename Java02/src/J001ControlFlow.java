//Write a method called printNumberInWord.
// The method has one parameter number which is the whole number.
// The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
// or other for any other number including negative numbers.
// You can use if-else statement or switch statement whatever is easier for you.


public class J001ControlFlow {

    public static void main(String[] args) {


        printNumberInWord(0);

    }

    public static void printNumberInWord(int num) {
        if (num == 0) {
            System.out.println("Zero");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");
        } else if (num == 6) {
            System.out.println("Six");
        } else if (num == 7) {
            System.out.println("Seven");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {
            System.out.println("Nine");
        } else
            System.out.println("Other");
    }
}
