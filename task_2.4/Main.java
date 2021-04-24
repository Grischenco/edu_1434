/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 
        Scanner in =new Scanner(System.in);
 int vklad;
 int prosent, p;
 int spok;
 double sum=0;
        System.out.println("введите вклад:");
        vklad=in.nextInt();
        System.out.println("введите процент:");
        prosent=in.nextInt();
        System.out.println("введите срок:");
        spok=in.nextInt();
        prosent = (vklad*prosent)/100;
        p=vklad+prosent;

        for (int i = 1; i <=spok ; i++) {
            System.out.println("процент за: " + i + " - год = " + (prosent*i));
            p=prosent*i;
             sum= vklad+p;
            System.out.println("Всего: " + sum);
        }

            }
        }
    }

