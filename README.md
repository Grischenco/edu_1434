# edu_1434import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Hotel marriot = new Hotel(new Room[]
                {
                        new Room(2, true, true, false, false, 11),
                        new Room(2, true, true, false, false, 12),
                        new Room(2, true, true, true, false, 13),
                        new Room(3, true, true, true, true, 21),
                        new Room(4, true, true, false, false, 22),
                        new Room(2, false, false, false, false, 23),
                        new Room(2, true, false, true, false, 31),
                        new Room(1, false, true, true, true, 32),
                        new Room(1, true, true, true, true, 33)
                });
        while (true) {
            System.out.println(" Введите команду ");
            String command = reader.nextLine();
            if (command.equals("еда"))
                marriot.getRoomsWithEat();
            else if (command.equals("wifi"))
                marriot.getRoomsWithWifi();
            else if (command.equals("туалет"))
                marriot.getRoomsWithToiler();
            else if (command.equals("душ"))
                marriot.getRoomsWithShower();
            else if (command.equals("койка")){
                System.out.println(" Введите к-во коек ");
                int koek = reader.nextInt();
???????
                    marriot.getRoomsWithPlece()
