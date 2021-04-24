/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы. То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 Scanner in = new Scanner(System.in);
    int a,c = 0, rez=0;
        System.out.println("a= ");
        a = in.nextInt();
        System.out.print("делители числа "+ a +": ");
        for (int i = 2; i < a; i++) {
            if(a%i ==0){
                c++;
                rez = a/i;
                System.out.print(rez+",");
        }
    }if (c==0) System.out.println("число простое");
        else System.out.println("\nколличество делителей: " + c);
    }
}
