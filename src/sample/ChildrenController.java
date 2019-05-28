package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ChildrenController {

    @FXML
    private Label data;

    private String transportData; // тут можно запомнить данные, но не обязательно

    public void init(){
        // метод вызывается из первого контроллера
        // изменяем уже поолученные данные
        transportData = toUpper(transportData);
        // и осталось вывести данные на контрол
        initOutputLabel();
    }


    public void sendData(String data){
        transportData = data;
    }

    public String toUpper(String line){
        return line.toUpperCase();
    }

    public void initOutputLabel(){
        data.setText(transportData);
    }

}
