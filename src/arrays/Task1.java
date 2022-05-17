package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
         */
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{0, 6, 11, 14, 9};
        int[] array2 = new int[5];
        int numberFromConsole = scanner.nextInt();
        boolean foundNumber = false;
        for (int indexArray = 0; indexArray < array.length; indexArray++) {
            if (numberFromConsole != array[indexArray]) {
                array2[indexArray] = array[indexArray];
            } else {
                foundNumber = true;
            }
        }
        if (!foundNumber) {
            System.out.println("Такого числа нет");
        }
        System.out.println(Arrays.toString(array2));
    }
}


