package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         /*
2.Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.
     */
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        Random r = new Random();
        for (int indexArray = 0; indexArray < array.length; indexArray++) {
            array[indexArray] = r.nextInt(sizeArray);
        }
        System.out.println(Arrays.toString(array));

        int min = 0;
        int max = 0;
        int avr = 0;

        for (int j : array) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
            avr += j;
        }
        System.out.println("минимальное значение: " + min);
        System.out.println("максимальное значение: " + max);
        System.out.println("среднее значение: " + avr / array.length);
    }
}




