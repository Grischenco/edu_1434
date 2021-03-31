/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 String [] combs= {"Мама","Мила","Раму"};
        int i, j, k;
        for ( i=0; i<combs.length; i++)
            for (j = 0; j < combs.length; j++)
                for (k = 0; k < combs.length; k++)
                    if (combs[i] != combs[j] && combs[j] != combs[k] && combs[k] != combs[i]) {
                        System.out.println(combs[i]+combs[j]+combs[k]);

    }
}
