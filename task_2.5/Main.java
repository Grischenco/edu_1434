/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 Scanner in =new Scanner(System.in);
       int a;
        System.out.println("a= ");
        a = in.nextInt();
 while (a !=10){
     System.out.println("Not, enter a= ");
     a = in.nextInt();
 }
        System.out.println(" Yes, esc");

    }
}
