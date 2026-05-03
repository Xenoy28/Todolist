module appli {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires spring.security.crypto;
    requires commons.logging;

    opens appli.accueil to javafx.fxml;
    exports appli;
}