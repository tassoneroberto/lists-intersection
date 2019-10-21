package com.robertotassone;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public final class App extends Application {
    
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("List Intersection");
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 400, 300);

        primaryStage.setTitle("List Intersection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
