package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Button btnSubmit;

    @FXML
    private PasswordField txtName;

    @FXML
    private Label lblName;


    @FXML
  public void showName(MouseEvent event) {
  String name;
  name = txtName.getText();
  lblName.setText(name);
    }


}






// (in scene builder) view, shows sample skeleton