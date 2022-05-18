package arrays2;

public class Task2 {
    public static void main(String[] args) {
        /*
        2. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String 8х8. С помощью циклов задать элементам циклам значения B(Black) или W(White).
Результат работы программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
         */
        String[][] array = new String[8][8];
        String black = "B";
        String white = "W";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = black;
                } else {
                    array[i][j] = white;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
