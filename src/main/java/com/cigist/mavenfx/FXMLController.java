package com.cigist.mavenfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField textName;

    @FXML
    private void handleButtonAction(ActionEvent event) {
//        label.setText(textName.getText());
        popUp();
    }

    private void popUp() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("Hello " + textName.getText());

        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
