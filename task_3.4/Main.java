/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/


public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
  Scanner in = new Scanner(System.in);
        int a, b;
        String comander="";
        System.out.println("Enter number: a, b ");
        while (!comander.equals("stop")) {
            a = in.nextInt();
            b = in.nextInt();
            if (sum(a, b) > 10) System.out.println(true);
            else System.out.println(false);
            System.out.println("для выхoда нажмите stop");
            in.nextLine();
            comander=in.nextLine();
        }
        System.out.println("stop");
    }
    static int n(int a, int b) {
      int sum =a+b;
      return sum;
    }
}
