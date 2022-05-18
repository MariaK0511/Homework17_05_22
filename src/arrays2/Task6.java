package arrays2;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        /*
        6. Создайте двумерный массив целых чисел.
         Отсортируйте элементы в строках двумерного массива по возрастанию.
         */
        int[][] array = new int[6][5];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] ints : array) {
            Arrays.sort(ints);
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}


