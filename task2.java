/* task2
* 2) Посмотрите на код, и подумайте 
сколько разных типов исключений вы тут сможете получить?

Код парсит строковую матрицу, на предмет наличия целых чисел, затем все найденные числа суммирует.
Если в матрице будут не целочисленные значения или значения типа null то будет выкидываться исключение типа NumberFormatException.
Исключение ArrayIndexOutOfBoundsException будет если заданная длина столбцов будет больше 5.
При прохождении первого цикла for, если длина строки меньше длины столбцов, то во второй цикл не попадем, также исключение NumberFormatException будет
*/

public class task2 {
    public static void main(String[] args) {
        String[][] arr = new String[2][5];
        arr[0][0] = "2";
        arr[0][1] = "4";
        arr[1][0] = "5";
        arr[1][1] = "8";
        arr[1][2] = "1";
        arr[1][3] = "4";
        arr[1][4] = "5";
        sum2d(arr);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
    return sum;
    }
}
