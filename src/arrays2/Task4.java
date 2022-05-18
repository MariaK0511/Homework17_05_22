package arrays2;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //4. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(5);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}



