package arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).
         */
        int[] array1 = {-54, 84, -35, 17, 37};
        int avrArray1 = 0;
        System.out.println("1-й массив " + Arrays.toString(array1));

        for (int indexArray1 : array1) {
            avrArray1 += indexArray1;
        }
        System.out.println("среднее арифметическое чисел равно: " + avrArray1 / array1.length);

        int[] array2 = {75, 33, -19, -1, 4};
        int avrArray2 = 0;
        System.out.println("2-й массив " + Arrays.toString(array2));

        for (int indexArray2 : array2) {
            avrArray2 += indexArray2;
        }
        System.out.println("среднее арифметическое чисел равно: " + avrArray2 / array2.length);

        if (avrArray1 > avrArray2) {
            System.out.println("Среднее арифмитическое значение первого массива больше");
        } else if (avrArray1 < avrArray2) {
            System.out.println("Среднее арифмитическое значение второго массива больше");
        } else {
            System.out.println("Средние арифмитические значения 2-х массивов равны");
        }
    }
}



