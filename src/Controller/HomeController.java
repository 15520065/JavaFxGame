package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    public Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //MediaPlayerManager.getInstance().playBackground();

        button.getStyleClass().add("circle-pink");
    }

    public void buttonClick(ActionEvent actionEvent) {
        MediaPlayerManager.getInstance().playSound("correct.wav");
    }
}
