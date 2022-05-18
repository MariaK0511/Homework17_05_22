package arrays2;

public class Task5 {
    public static void main(String[] args) {
        //5. Создайте двумерный массив. Выведите на консоль диагонали массива.
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


