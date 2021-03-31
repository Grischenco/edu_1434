/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
int sum=0, n=0;
        int[] number = {1,3,5,45,3};
        for (int i = 0; i < number.length; i++) {
            if (sum <=10) {
                n++;
                sum += number[i];
            }

        } System.out.println("сумма " + n + " елементов:  " + sum+" > 10");


     }}

    }
}
