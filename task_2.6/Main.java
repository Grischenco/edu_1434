/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 Scanner in = new Scanner(System.in);
       float a, b;
        System.out.println("a= ");
        a = in.nextInt();
        System.out.println("b= ");
        b = in.nextInt();
        if (a % b != 0){
                     System.out.println("rez = " + a/b);
        }
        else
            System.out.println("yes");
    }
}
