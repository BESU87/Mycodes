public class palindrome {


    public static void main(String[] args) {
        isPalindrome(1001);


    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 9) {
            reverse += (number % 10);
            reverse *= 10;
            number = (number / 10);
        }
        reverse += number;


        if (original == reverse) {
            System.out.println(" the number " + reverse + " is palindrome ");
            return true;
        } else {
            System.out.println(" the number " + original + " is not palindrome");
            return false;

        }
    }
}
