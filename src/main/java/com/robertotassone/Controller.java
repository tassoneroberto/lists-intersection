package com.robertotassone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btnRun;

    @FXML
    private TextField tfSizeA;

    @FXML
    private TextField tfSizeB;

    @FXML
    private ChoiceBox<String> cbListToHashSet;

    @FXML
    private TextField tfOutputSize;

    @FXML
    private TextField tfTimePopulation;

    @FXML
    private TextField tfTimeIntersection;

    @FXML
    private TextField tfTimeTotal;

    private Model model;

    public Controller() {
        model = new Model();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void runIntersection(ActionEvent event) {
        int sizeListA;
        int sizeListB;
        try {
            sizeListA = Integer.parseInt(tfSizeA.getText());
            sizeListB = Integer.parseInt(tfSizeB.getText());
        } catch (NumberFormatException e) {
            showAlert("Invalid input!");
            return;
        }
        if (sizeListA <= 0 || sizeListB <= 0) {
            showAlert("Sizes must be positive integers!");
            return;
        }
        model.setSizeListA(sizeListA);
        model.setSizeListB(sizeListB);
        model.setListAinHashSet(cbListToHashSet.getValue().equals("A"));
        model.intersection();

        tfOutputSize.setText(String.format("%d", model.getIntersectionSize()));
        tfTimePopulation.setText(String.format("%d", model.getPopulationTime()));
        tfTimeIntersection.setText(String.format("%d", model.getIntersectionTime()));
        tfTimeTotal.setText(String.format("%d", model.getPopulationTime() + model.getIntersectionTime()));

    }

}
