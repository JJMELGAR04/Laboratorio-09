package org.example.labo08;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Cafeteria UCA");
        stage.setScene(scene);
        stage.setMinHeight(650);
        stage.setMinWidth(870);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}