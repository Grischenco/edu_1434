package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Controller {
    Socket socket;
    DataOutputStream out;
    @FXML
    TextArea messageWindow;
    @FXML
    TextField textField;
    @FXML
    private void send(){ // метод отправки сообщения
        try {
            String str = textField.getText(); // Получаем сообщение от пользователя
            out.writeUTF(str); // Отправляем сообщение на сервер
            textField.clear(); // Очищаем поле ввода
            textField.requestFocus(); // Возвращаем фокус на поле ввода
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    @FXML
    private void connect(){ // метод подключения к серверу
        try {
            socket = new Socket("localhost",8189); // Открывает сокет на порту 8189
            DataInputStream in = new DataInputStream(socket.getInputStream()); // поток ввода
            out = new DataOutputStream(socket.getOutputStream()); // поток вывода
            Thread thread = new Thread(new Runnable() { // открывает процессорный поток
                @Override
                public void run() {
                    try {
                        while (true){
                            String response = in.readUTF(); //Ждём сообщение от сервера
                            messageWindow.appendText(response+"\n"); // Выводи сообщение от сервера
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            });
            thread.start(); // запускаем поток
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
