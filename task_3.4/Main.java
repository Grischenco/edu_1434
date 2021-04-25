/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/


public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
Scanner in = new Scanner(System.in);
        System.out.println("Enter number: a, b ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (n(a,b)>10) System.out.println(true);
        else System.out.println(false);
    }
    static int n(int a, int b) {
      int sum =a+b;
      return sum;
    }
}
