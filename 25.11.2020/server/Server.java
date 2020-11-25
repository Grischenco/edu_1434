package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8189); // Отерывает сокет для прослушивания порта
            System.out.println("INFO: Сервер запущен");
            while (true){
                Socket socket = serverSocket.accept(); // Ожидаем клиента
                Thread thread = new Thread(new Runnable() { // Открываем поток для клиента
                    @Override
                    public void run() {
                        try {
                            DataInputStream in = new DataInputStream(socket.getInputStream()); // Поток ввода
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // Поток вывода
                            out.writeUTF("Введите имя:"); // Отправляем запрос на ввод имени
                            String userName = in.readUTF(); // Получаем имя клиента
                            User user = new User(socket,userName); // Создаём объект клиента
                            users.add(user); // добавляем пользователя в списое пользователей
                            user.sendMessage(users,"Клинет "+userName+" подключился","СЕРВЕР"); // Рассылаем сообщение всем, о том, что пользователь подключился
                            while (true){
                                String request = in.readUTF(); // Получаем сообщение от клиента
                                System.out.println(request); // Печатаем сообщение от клиента на экране
                                user.sendMessage(users,request,userName); // Рассылаем всем это сообщение
                            }
                        }catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

class User{
    private Socket socket;
    private String userName;
    User(Socket socket, String userName){
        this.socket = socket;
        this.userName = userName;
    }
    public Socket getSocket(){
        return this.socket;
    }
    public String getUserName(){
        return this.userName;
    }
    public void sendMessage(ArrayList<User> users,String message,String userName){
        for (User user: users) { // Перебираем список пользователей
            DataOutputStream out = null;
            try {
                out = new DataOutputStream(user.getSocket().getOutputStream());
                if(user.getUserName().equals(this.userName)) { // Проверяем текущий пользователь или нет
                    out.writeUTF("Сервер: отправлено"); // Отправляем сообщение
                    continue; // Пропускаем оставшийся код
                }

                out.writeUTF(userName+":"+message); // Отправляем сообщение
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
