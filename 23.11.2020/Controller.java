package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea messageWindow;
    @FXML
    TextField textField;
    @FXML
    private void send(){
        String str = textField.getText();
        messageWindow.appendText(str+"\n");
        textField.clear();
        textField.requestFocus();
    }
}
