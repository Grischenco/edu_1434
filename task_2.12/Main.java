/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
Scanner in = new Scanner(System.in);
        System.out.println("enter length ");
        int leng = in.nextInt();
        int [] arrays = new int [leng];
        System.out.println("enter array ");
        for (int i = 0; i < leng; i++) {
             arrays [i] = in.nextInt();
            //System.out.println(arrays[i]);
        }for (int i = 0; i < leng; i++) {
            System.out.print(arrays[i]+",");
    }
}
