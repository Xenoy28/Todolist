package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class InscriptionController {
    @FXML
    private TextField nomField;
    @FXML
    private TextField prenomField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private Label errorLabel;
    @FXML
    protected void onInscriptionClick() {
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String motDePasse = passwordField.getText();
        String confirmation = confirmPasswordField.getText();
        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty()
                || motDePasse.isEmpty() || confirmation.isEmpty()) {
            afficherErreur("Tous les champs sont obligatoires.");
            return;
        }
        if (!motDePasse.equals(confirmation)) {
            afficherErreur("Les mots de passe ne correspondent pas.");
            return;
        }
        if (email.equals(LoginController.email_valide)) {
            afficherErreur("Cet email est déjà utilisé.");
            return;
        }
        errorLabel.setText("");
        System.out.println("Inscription réussie !");
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
    }
    @FXML
    protected void onRetourClick() throws IOException {
        StartApplication.changeScene("accueil/Login");
    }
    private void afficherErreur(String message) {
        errorLabel.setText(message);
        errorLabel.setStyle("-fx-text-fill: red;");
    }
}
