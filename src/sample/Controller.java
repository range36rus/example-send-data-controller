package sample;

import javafx.application.Platform;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField data;
    @FXML
    private Label dataName;

    public void sendData(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("children-page.fxml"));
        Parent root = null;
        try {
            root = (Parent) fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            Platform.exit();
            return;
        }
        Stage st = new Stage();
        st.setResizable(false);
        st.setTitle("Children page");
        st.setScene(new Scene(root, 700, 450));
        ChildrenController childrenController = fxmlLoader.getController(); // получаем контроллер второй страницы
        childrenController.sendData(data.getText()); // передаём туда данные
        childrenController.init(); // инициализиуем страницу (работаем с данными)
        st.show();
    }
}
