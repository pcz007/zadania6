import java.util.Arrays;
import java.util.Random;

public class Zadanie61 {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        String[] stringNumbers = new String[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            stringNumbers[(stringNumbers.length - i - 1)] = Integer.toString(numbers[i]);
        }
//        for (int numery:numbers) {
//            System.out.print(" " + numery);
//        }
        System.out.print(Arrays.toString(numbers));
        System.out.print(Arrays.toString(stringNumbers));
    }
}
