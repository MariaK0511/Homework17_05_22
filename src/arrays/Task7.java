package arrays;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //7.Реализуйте алгоритм сортировки пузырьком.
        int[] array = {12, 2, 5, 1, 19};
        int temp;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j>i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
