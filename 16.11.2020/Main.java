import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Первое число: ");
                int num1 = scanner.nextInt();
                System.out.print("Второе число: ");
                int num2 = scanner.nextInt();

                System.out.println(num1/num2);
                break;
            }catch (InputMismatchException e){
                System.out.println("Вы ввели недопустимый символ, допустимые символы {1,2,3,4,5,6,7,8,9,0}");
            }catch (ArithmeticException e){
                System.out.println("На ноль делить нельзя!!!");
            }
            System.out.println("Попробуй ещё раз");
        }




        /*int[] nums = {4,5,6,4,7,4};
        for (int i=0; i< nums.length; i++){
            try {
                if(nums[i] == nums[i+1]){
                    System.out.println("Есть два одинаковых числа подряд");
                    break;
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        System.out.println("Программа завершилась");*/
    }
}
