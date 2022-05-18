package arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Создать трехмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
         */
        int n = new Scanner(System.in).nextInt();
        int[][][] testArray = new int[][][]{{{1, 2, 3}, {10, 20, 30, 40}}, {{500, 600}}};

        for (int[][] arrayMiddle : testArray) {
            for (int[] arrayInternal : arrayMiddle) {
                for (int item : arrayInternal) {
                    item += n;
                    System.out.print(item + " ");
                    System.out.println();
                }
            }
        }
    }
}
