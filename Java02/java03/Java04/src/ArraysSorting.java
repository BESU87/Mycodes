import java.util.Arrays;
import java.util.Random;

public class ArraysSorting {

    public static void main(String[] args) {

        int[] unsortedArray =getRandomArray(7);
        System.out.println(Arrays.toString(unsortedArray));

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < unsortedArray.length - 1; i++){

                if(unsortedArray [i] < unsortedArray [i +1]){
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("------->" + Arrays.toString(unsortedArray));
                }
            }
        }

    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int [] newInt= new int [len];
        for (int i =0; i <len; i++){
            newInt [i] = random.nextInt(1000);
        }
        return newInt;
    }
}
