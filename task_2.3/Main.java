/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
public class Yrok_5 {
    public static void main(String[] args) {
        //ПЕРЕМЕННЫЕ
int i,j;
        //создаем массив
int [][] nums = new int[10][];
//цыкл для создания триугольного массива
        for ( i = 0; i < nums.length; i++) {
            //создание строки в массиве
            nums[i] = new int[i + 1];}
        //заполняем двухмерный массив
        for ( i = 0; i < nums.length; i++) {
                for ( j = 0; j <nums[i].length ; j++) {
                    //вводи значение елемента массива
                    nums[i][j] = 8;
                    //выводим на екран
                    System.out.print(nums[i][j] );
                }System.out.println();

                }

            }
        }
    

