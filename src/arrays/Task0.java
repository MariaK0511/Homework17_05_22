package arrays;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        /*
        0. Создайте массив целых чисел.
        Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[]{1, 3, 4, 2, 7, 9, 15, 12, 11, 8};
        boolean find = false;

        for (int j : array) {
            if (num == j) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Заданное число входит в массив " + num);
        } else {
            System.out.println("Заданное число не входит в массив " + num);
        }
    }
}
