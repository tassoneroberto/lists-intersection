package com.robertotassone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField tfSizeA;

    @FXML
    private TextField tfSizeB;

    private Model model;

    public Controller() {
        model = new Model();
    }

    @FXML
    private void runIntersection(ActionEvent event) {
        System.out.println("Size list A: " + tfSizeA.getText());
        System.out.println("Size list B: " + tfSizeB.getText());
        // TODO: Check input data
        int sizeListA = Integer.parseInt(tfSizeA.getText());
        int sizeListB = Integer.parseInt(tfSizeB.getText());
        model.setSizeListA(sizeListA);
        model.setSizeListB(sizeListB);
        model.setListAinHashSet(true); // TODO: get choice from UI
        try {
            model.generateData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            model.intersection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Intersection size: " + model.getIntersectionSize());
        System.out.println("Computation time: " + model.getComputationTime());
    }
}
