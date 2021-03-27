/* 
ВНИМАНИЕ! ДЛЯ РЕШЕНИЯ ЗАДАЧИ НЕОБХОДИМО ПРОСМОТРЕТЬ УРОК №4 https://www.youtube.com/watch?v=WmZ6kVTlWtg&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=4
Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */
import jana.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // Ваш код
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter TC = ");
        int TC = reader.nextInt();
        int TF= (9 / 5) * TC + 32;
        System.out.print("TF = " + TF);
    }
}
