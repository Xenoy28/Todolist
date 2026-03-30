package appli.accueil;

import appli.StartApplication;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import java.io.IOException;

public class InscriptionController {

    @FXML

    void retour(ActionEvent event) throws IOException {

        StartApplication.changeScene("accueil/Login");

    }

}

