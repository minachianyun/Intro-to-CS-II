/*
Assignment 5
Name: 曾千芸
Student Number: 109504501
Course: 2021-CE1004-B
*/

package com.example.a5_109504501_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField textfield = new TextField("");
        ToggleGroup group = new ToggleGroup();
        RadioButton radiobutton = new RadioButton("A");
        RadioButton radiobutton2 = new RadioButton("B");
        radiobutton.setToggleGroup(group);
        radiobutton2.setToggleGroup(group);
        CheckBox checkbox = new CheckBox("CheckBox");
        Button button1 = new Button("press1");
        Button button2 = new Button("press2");
        Button button3 = new Button("press3");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Pane a = new HBox(textfield,radiobutton,radiobutton2,checkbox);
        Pane b = new HBox(button1,button2,button3);
        Pane out = new VBox(a,b);
        Scene scene = new Scene(out, 320, 240);
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();

        button1.setOnAction(e -> {System.out.println(textfield.getCharacters());});
        button2.setOnAction(e -> {System.out.println(group.getSelectedToggle());});
        button3.setOnAction(e -> {System.out.println(checkbox.isSelected());});
    }

    public static void main(String[] args) {
        launch();
    }
}