package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LoginController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
    @FXML
    protected void onLoginClick() {
        String email = emailField.getText();
        String password = passwordField.getText();
        System.out.println("Email saisi : " + email);
        System.out.println("Mot de passe saisi : " + password);
    }
    @FXML
    void onInscriptionClick() throws IOException {
        StartApplication.changeScene("accueil/Inscription");
    }
}
