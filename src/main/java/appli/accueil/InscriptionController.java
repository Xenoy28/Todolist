package appli.accueil;

import appli.StartApplication;

import java.io.IOException;

public class InscriptionController {
    void onInscriptionClick() throws IOException {
        StartApplication.changeScene("accueil/Login");
    }
}
