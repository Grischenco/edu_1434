/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Ваш код
        int a, rez;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = reader.nextInt();
        rez = a + a*0.15;
        System.out.print("rez = "+rez);
        
    }
}
