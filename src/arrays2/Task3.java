package arrays2;

public class Task3 {
    public static void main(String[] args) {
        /*
        3. Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.
Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
Ожидаемый результат: 1 2 3  1 1 1  0 0 0
         */
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[array1.length][array2[0].length];

        for (int i = 0; i < array3[0].length; i++) {
            for (int j = 0; j < array3.length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    array3[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}


