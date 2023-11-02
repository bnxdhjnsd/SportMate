package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.stage = stage;
        stage.setTitle("SportM!");
        changeStage("login.fxml");
        stage.show();
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        //stage.setScene(new Scene(root));
        //Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setResizable(false);

        //stage.setScene(scene);

    }
    public static void changeStage(String fxml){
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addM(String fxml){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public static void addT(String fxml){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public static void addE(String fxml){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}