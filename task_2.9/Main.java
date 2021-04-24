/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
 int[]arr=new int[10];
       int n=0, x=1, y=10;
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 10);
            for (int i :arr) {
                System.out.print(i+" ");
            } System.out.println();
       for (int i = 0; i < arr.length; i++){
           if(arr[i]==5)
               n++;
       //else System.out.println("noy");
    } System.out.println("число 5 найдено "+n +" разa");
    }
}
