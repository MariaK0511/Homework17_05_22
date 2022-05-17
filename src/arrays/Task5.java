package arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        5. Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.
         */
        int[] array = new int[]{11, 2, 33, 4, 5, 17, 10};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


