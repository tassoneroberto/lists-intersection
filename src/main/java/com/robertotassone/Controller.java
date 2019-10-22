package com.robertotassone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField tfSizeA;

    @FXML
    private TextField tfSizeB;

    @FXML
    private void runIntersection(ActionEvent event) {
        System.out.println("Size list A: " + tfSizeA.getText());
        System.out.println("Size list B: " + tfSizeB.getText());

    }
}
