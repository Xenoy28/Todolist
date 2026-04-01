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
    protected static String email_valide = "mathis@zzz.com";
    protected String mdp_valide = "mathisZZZ";
    @FXML
    protected void onConnexionClick() {
        String email = emailField.getText();
        String motDePasse = passwordField.getText();
        System.out.println("Tentative de connexion : " + email);
        if (email.equals(email_valide) && motDePasse.equals(mdp_valide)) {
            System.out.println("Connexion réussie !");
            errorLabel.setText("");
        } else {
            errorLabel.setText("Email ou mot de passe incorrect.");
        }
    }
    @FXML
    protected void onInscriptionClick() throws IOException {
        StartApplication.changeScene("accueil/Inscription");
    }
    @FXML
    protected void onMotDePasseOublieClick() {
        System.out.println("Mot de passe oublié cliqué");
    }
}
