public class PerfectNum {

    public static void main(String[] args) {

        boolean per = (isPerfectNum(-1));
        System.out.println(per);
    }

    public static boolean isPerfectNum(int number) {
        if (number < 1) {
            return false;
        }

        int temp = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                temp = temp + i;
            }


        }
        return number == temp;
    }
}

