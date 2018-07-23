import java.util.Random;
//zadanie nieukończone
public class Zadanie61 {

    public static void main(String[] args) {

        int size = 10;
        int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            size++;
        }
        size--;
        int[] numbers2 = new int[size];

        for (int tablica20:numbers2) {
            System.out.print(tablica20 + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers2[size] = numbers[i];
            size--;
        }
        for (int numery : numbers2) {
            System.out.print(numery + " ");

        }
    }
}
