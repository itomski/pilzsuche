package de.lubowiecki.pilzsuche;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class PilzController implements Initializable {

    @FXML
    private GridPane board;

    private Random rand = new Random();


    @FXML
    protected void setNext() {
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        Button b = new Button("X");
        board.add(b, x, y);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //... Arbeiten zum Start des Programms
    }
}