/*
Assignment 5
Name: 曾千芸
Student Number: 109504501
Course: 2021-CE1004-B
*/

package com.example.a5_109504501_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // label
        Label label = new Label("What's up!");
        // image
        Image image = new Image("a5_109504501.jpg", 200,200, true, true);
        //checkbox
        CheckBox checkbox = new CheckBox("Dog: Lucky");
        Label label2 = new Label("Is Lucky cute?");
        // toggleGroup: 當放置在ToggleGroup中，只能選擇一個RadioButton勾選
        // 單選按鈕組
        ToggleGroup group = new ToggleGroup();
        RadioButton radiobutton = new RadioButton("cute");
        RadioButton radiobutton2 = new RadioButton("not cute");
        // setToggleGroup(ToggleGroup val): 設置屬性toggleGroup的值。
        radiobutton.setToggleGroup(group);
        radiobutton2.setToggleGroup(group);

        // button
        Button button = new Button("Send");
        ImageView photo = new ImageView(image);

        Pane word = new VBox(label,checkbox,label2);
        Pane check = new HBox(radiobutton,radiobutton2);
        Pane all = new VBox(word,check,button);
        Pane out = new HBox(photo,all);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(out, 320, 240);
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}