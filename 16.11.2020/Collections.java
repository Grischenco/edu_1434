import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();
        System.out.print("Напишите марку автомобиля которую вы помните: ");
        String userAnswer = scanner.nextLine().toLowerCase();
        cars.add(userAnswer);
        while(!userAnswer.equals("нет")){
            System.out.println("Марки автомобилей: "+cars);
            System.out.println("Помнишь ещё какую нибудь марку автомобиля?\n" +
                    "Если да, напиши её название, если нет, напиши \"нет\"");
            userAnswer = scanner.nextLine().toLowerCase();
            // indexOf возвращает индекс первого вхождения строки в список.
            // Если объект не найден, то возвращается -1
            if (cars.indexOf(userAnswer) == -1 && !userAnswer.equals("нет"))
                cars.add(userAnswer);
            else
                System.out.println("Элемент "+userAnswer+" уже существует");
        }
        System.out.println("Марки автомобилей которые вы вспомнили: "+ cars);
        System.out.print("Вывести на экран элемент с индексом: ");
        int index = scanner.nextInt();
        if (cars.size() > index)
            System.out.println(cars.get(index));
        else
            System.out.println("Элемнта с индексом "+index+" не существует");

        // условие ? если условие true : если условие false
        System.out.println( cars.size()>index?cars.get(index):"Элемнта с индексом "+index+" не существует" );

        /*String[] cars1 = new String[3];
        cars1[0] = "BMW";
        cars1[1] = "Audi";
        cars1[2] = "VAZ";
        for (int i = 0; i < cars1.length; i++) {
            System.out.print(cars1[i]+" ");
        }*/

    }
}
