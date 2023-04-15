package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage window;
    Scene scene1 , scene2;

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
            Label lblClickCounter = new Label();

        stage.setTitle("FIRST STAGE");
        //  SCENE 1
        Button btnOfSceneOne = new Button("GO TO SCENE TWO");
        btnOfSceneOne.setOnAction(e -> {
            window.setScene(scene2);
            window.setTitle("Happy");
        });
        Label lblOfSceneOne = new Label("😭");
        lblOfSceneOne.setFont(new Font(80));
        VBox layoutONE = new VBox(20);
        layoutONE.getChildren().addAll(lblOfSceneOne,btnOfSceneOne,lblClickCounter);
        scene1 = new Scene(layoutONE, 300, 400);

        //  SCENE 2
        Button btnOfSceneTwo = new Button("GO TO SCENE ONE");
        btnOfSceneTwo.setOnAction(e -> {
            window.setScene(scene1);
            window.setTitle("Sad");
        });
        Label lblOfSceneTwo = new Label("😆");
        lblOfSceneTwo.setFont(new Font(80));
        VBox layoutTWO = new VBox(20);
        layoutTWO.getChildren().addAll(lblOfSceneTwo,btnOfSceneTwo,lblClickCounter);
        scene2 = new Scene(layoutTWO, 400,300);

        window.setScene(scene1);
        window.setTitle("Sabihin mo helloworld!");
        window.show();

    }


    public static void main(String[] args) {
        launch();
    }
}