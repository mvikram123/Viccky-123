package com.example.worlddictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.Group;

public class Main extends Application {
    public static Group root;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        root = new Group();
        stage.setTitle(" world Dictionary");
        DictionaryPage page = new DictionaryPage();
        root.getChildren().add(page.root);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("world dictionary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

