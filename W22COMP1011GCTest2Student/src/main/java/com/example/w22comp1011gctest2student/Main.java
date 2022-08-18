/* Name - Twisha Chachra
Student Number - 200474646 */
package com.example.w22comp1011gctest2student;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Sales System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}