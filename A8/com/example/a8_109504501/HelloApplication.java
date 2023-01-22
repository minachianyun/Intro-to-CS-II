/**
 Assignment 8
 Student Number : 109504501
 Course : CE1004-B
 */
package com.example.a8_109504501;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloApplication extends Application {
    int count = 0;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("編碼小工具");
        Label l1 = new Label("輸入：");
        Label l2 = new Label("輸出：");
        Text l3 = new Text(" ");
        TextField input = new TextField("");
        TextField output = new TextField("");
        Button add = new Button("新建");
        Button save = new Button("存檔");
        Button code = new Button("編碼");
        Button paste = new Button("複製");
        Button clear = new Button("清空");
        Pane a = new HBox(l1, input);
        Pane b = new HBox(l2, output);
        Pane c = new HBox(add, save, code, paste, clear);
        Pane ll = new HBox(l3);
        Pane all = new VBox(a, b, c, ll);
        Scene sc = new Scene(all, 300, 200);
        stage.setScene(sc);
        stage.show();


        // 新建
        add.setOnAction(e -> {
            if(count == 0){
                try {
                    adding();
                    l3.setText("已新建");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                count++;

            }
            else{
                l3.setText("新建失敗");
            }

        });
        

        // 存檔
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                try {
                    File file = new File("109504501.txt");
                    FileWriter writer = new FileWriter(file);
                    writer.write(output.getText());
                    writer.flush();
                    writer.close();
                    l3.setText("已存檔");
                }
                catch (IOException exception) {
                    exception.printStackTrace();

                }
            }

        });


        // 編碼
        code.setOnAction(e -> {
            if(output.getText() != null){
                StringBuilder sb = new StringBuilder();
                char[] letters = input.getText().toCharArray();
                for (char ch : letters) {
                    sb.append((byte) ch);
                }
                output.setText(sb.toString());
                l3.setText("已編碼");
            }
            else{
                l3.setText("編碼失敗");
            }
        });

        // 複製
        paste.setOnAction(e -> {
            if(output.getText() != ""){
                final Clipboard clipboard = Clipboard.getSystemClipboard();
                final ClipboardContent content = new ClipboardContent();
                content.putString(output.getText());
                clipboard.setContent(content);
                l3.setText("已複製");
            }
            else{
                l3.setText("複製失敗");
            }
        });

        // 清空
        clear.setOnAction(e -> {
            input.setText("");
            output.setText("");
            l3.setText("已清空");
        });
    }
    // 新建 function

    public static void adding() throws IOException {

        File file = new File("109504501.txt");
        file.createNewFile();
    }
}