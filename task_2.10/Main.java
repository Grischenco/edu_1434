/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 int [] number = {4,5,6,6,4};
        for (int i = 0; i < number.length ; i++) {
                      if (number[i] == number[i+1]  )
                    System.out.println("yes");
                      else
                          System.out.println("noy");
    }
}
