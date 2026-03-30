package appli.accueil;
import appli.StartApplication;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private Label labelAurevoir;

    @FXML
    private Label labelErreur;

    @FXML
    private PasswordField mdpFeild;

    @FXML
    void connexion(ActionEvent event) {
        String email = emailField.getText();
        String password = mdpFeild.getText();
        System.out.println("email :" + email);
        System.out.println("password :" + password);
        if (email.isEmpty() || password.isEmpty()) {
            labelErreur.setText("Veuillez remplir tous les champs obligatoire ");
        } else if (email.equals("kamilyoubi27@gmail.com") && password.equals("Azerty1234")) {
            labelErreur.setText("Vous etes connecte");
        }else{
            labelErreur.setText(" les informations fournis ne sont pas complete");
        }
    }


    @FXML
    void incription(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/Inscription");

    }

    @FXML
    void mdpOublie(ActionEvent event) {

    }

}