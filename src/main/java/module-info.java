module de.lubowiecki.pilzsuche {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.lubowiecki.pilzsuche to javafx.fxml;
    exports de.lubowiecki.pilzsuche;
}