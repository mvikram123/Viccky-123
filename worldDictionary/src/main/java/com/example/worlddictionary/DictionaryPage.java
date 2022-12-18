package com.example.worlddictionary;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

 public class DictionaryPage {
     public AnchorPane root;
     DictionaryPage() throws IOException {

        // String name;
         root = FXMLLoader.load(getClass().getResource("DictionaryPage.fxml"));

     }
 }