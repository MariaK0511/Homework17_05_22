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
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix3[0].length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}


