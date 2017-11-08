package loginapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable{

    LoginModel loginModel = new LoginModel();

    @FXML
    private Label dbstatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(this.loginModel.isDatabaseConnected()) {
            this.dbstatus.setText("Подключено");
        }
        else {
            this.dbstatus.setText("Не подключено");
        }
    }

    @FXML
    public void login(ActionEvent event) {
        /* дописать логин метод
        if (username&&password)
        new Stage
        FXMLoader.getClass.getResource("/dbdata/dbdata.fxml")
        123213123123
         */
    }


}
