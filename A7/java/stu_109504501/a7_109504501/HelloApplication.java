/**
 Assignment 7
 Student Number : 109504501
 Course : CE1004-B
 */
package stu_109504501.a7_109504501;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public String calculate(String out){
        int b = 0;
        int a = 0;
        for(int i = 0; i < out.length(); i++){
            // 次方
            // charAt() 方法用於返回指定索引處的字符
            if(out.charAt(i) == '^'){
                for(int j = i-1; j >= 0; j--){
                    if(out.charAt(j) == '0' || out.charAt(j) == '1' || out.charAt(j) == '2' || out.charAt(j) == '3' || out.charAt(j) == '4' || out.charAt(j) == '5' || out.charAt(j) == '6' || out.charAt(j) == '7' || out.charAt(j) == '8' || out.charAt(j) == '9'){
                        b = j;
                    }else{
                        break;
                    }
                }
                for(int j = i + 1; j < out.length(); j++){
                    if(out.charAt(j) == '0' || out.charAt(j) == '1' || out.charAt(j) == '2' || out.charAt(j) == '3' || out.charAt(j) == '4' || out.charAt(j) == '5' || out.charAt(j) == '6' ||out.charAt(j) == '7' || out.charAt(j) == '8' || out.charAt(j) == '9'){
                        a = j;
                    }else{
                        break;
                    }
                }
                int v = 1;
                int origin = Integer.parseInt(out.substring(b,i));

                for(int k = 0; k < Integer.parseInt(out.substring(i+1,a+1));k++){
                    v = v * origin;
                }

                if(a == out.length() && b == 0){
                    return calculate(String.valueOf(v));
                }else if(a == out.length()){
                    return calculate(out.substring(0,b) + String.valueOf(v));
                }else if(b == 0){
                    return calculate(String.valueOf(v) + out.substring(a + 1,out.length()));
                }else{
                    return calculate(out.substring(0,b) + String.valueOf(v) + out.substring(a + 1,out.length()));
                }

            }
        }
        // 乘法
        for(int i = 0; i < out.length(); i++){
            if(out.charAt(i) == '*'){
                for(int j = i-1; j >= 0; j--){
                    if(out.charAt(j) == '.' || out.charAt(j) == '0' || out.charAt(j) == '1' ||out.charAt(j) == '2' || out.charAt(j) == '3' || out.charAt(j) == '4' || out.charAt(j) == '5' || out.charAt(j) == '6' || out.charAt(j) == '7' || out.charAt(j) == '8' || out.charAt(j) == '9'){
                        b = j;
                    }else{
                        break;
                    }
                }
                for(int j=i+1;j<out.length();j++){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        a = j;
                    }else{
                        break;
                    }
                }
                float p = Float.parseFloat(out.substring(b,i)) * Float.parseFloat(out.substring(i+1,a+1));

                if(a==out.length() && b==0){
                    return calculate(String.valueOf(p));
                }else if(a==out.length()){
                    return calculate(out.substring(0,b) + String.valueOf(p));
                }else if(b==0){
                    return calculate(String.valueOf(p) + out.substring(a+1,out.length()));
                }else{
                    return calculate(out.substring(0,b) + String.valueOf(p) + out.substring(a+1,out.length()));
                }
            }
            // 除法
            else if(out.charAt(i)=='/'){
                for(int j=i-1;j>=0;j--){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        b = j;
                    }else{
                        break;
                    }
                }
                for(int j=i+1;j<out.length();j++){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        a = j;
                    }else{
                        break;
                    }
                }
                float p = Float.parseFloat(out.substring(b,i)) / Float.parseFloat(out.substring(i+1,a+1));

                if(a==out.length() && b==0){
                    return calculate(String.valueOf(p));
                }else if(a==out.length()){
                    return calculate(out.substring(0,b) + String.valueOf(p));
                }else if(b==0){
                    return calculate(String.valueOf(p) + out.substring(a+1,out.length()));
                }else{
                    return calculate(out.substring(0,b) + String.valueOf(p) + out.substring(a+1,out.length()));
                }
            }
            // mod
            else if(out.charAt(i)=='%'){
                for(int j=i-1;j>=0;j--){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        b = j;
                    }else{
                        break;
                    }
                }
                for(int j=i+1;j<out.length();j++){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        a = j;
                    }else{
                        break;
                    }
                }
                float p = Float.parseFloat(out.substring(b,i)) % Float.parseFloat(out.substring(i+1,a+1));

                if(a==out.length() && b==0){
                    return calculate(String.valueOf(p));
                }else if(a==out.length()){
                    return calculate(out.substring(0,b) + String.valueOf(p));
                }else if(b==0){
                    return calculate(String.valueOf(p) + out.substring(a+1,out.length()));
                }else{
                    return calculate(out.substring(0,b) + String.valueOf(p) + out.substring(a+1,out.length()));
                }
            }
        }
        // 加法
        for(int i=0;i<out.length();i++){
            if(out.charAt(i)=='+'){
                for(int j=i-1;j>=0;j--){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        b = j;
                    }else{
                        break;
                    }
                }
                for(int j=i+1;j<out.length();j++){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        a = j;
                    }else{
                        break;
                    }
                }
                float p = Float.parseFloat(out.substring(b,i)) + Float.parseFloat(out.substring(i+1,a+1));

                if(a==out.length() && b==0){
                    return calculate(String.valueOf(p));
                }else if(a==out.length()){
                    return calculate(out.substring(0,b) + String.valueOf(p));
                }else if(b==0){
                    return calculate(String.valueOf(p) + out.substring(a+1,out.length()));
                }else{
                    return calculate(out.substring(0,b) + String.valueOf(p) + out.substring(a+1,out.length()));
                }
            }
            // 減法
            else if(out.charAt(i)=='-'){
                for(int j=i-1;j>=0;j--){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        b = j;
                    }else{
                        break;
                    }
                }
                for(int j=i+1;j<out.length();j++){
                    if(out.charAt(j)=='.'||out.charAt(j)=='0'||out.charAt(j)=='1'||out.charAt(j)=='2'||out.charAt(j)=='3'||out.charAt(j)=='4'||out.charAt(j)=='5'||out.charAt(j)=='6'||out.charAt(j)=='7'||out.charAt(j)=='8'||out.charAt(j)=='9'){
                        a = j;
                    }else{
                        break;
                    }
                }
                float p = Float.parseFloat(out.substring(b,i)) - Float.parseFloat(out.substring(i+1,a+1));

                if(a==out.length() && b==0){
                    return calculate(String.valueOf(p));
                }else if(a==out.length()){
                    return calculate(out.substring(0,b) + String.valueOf(p));
                }else if(b==0){
                    return calculate(String.valueOf(p) + out.substring(a+1,out.length()));
                }else{
                    return calculate(out.substring(0,b) + String.valueOf(p) + out.substring(a+1,out.length()));
                }
            }
        }
        return out;
    }
    // create button
    @Override
    public void start(Stage stage) throws IOException {
        TextField textField = new TextField("");
        Button btn_1 = new Button("1");
        Button btn_2 = new Button("2");
        Button btn_3 = new Button("3");
        Button btn_4 = new Button("4");
        Button btn_5 = new Button("5");
        Button btn_6 = new Button("6");
        Button btn_7 = new Button("7");
        Button btn_8 = new Button("8");
        Button btn_9 = new Button("9");
        Button btn_0 = new Button("0");
        Button btn_add = new Button("+");
        Button btn_minus = new Button("-");
        Button btn_multiply = new Button("*");
        Button btn_divide = new Button("/");
        Button btn_power = new Button("^");
        Button btn_percent = new Button("%");
        Button btn_equal = new Button("=");
        Button btn_undo = new Button("<-");
        Button btn_c = new Button("C");
        Button btn_point = new Button(".");
        textField.setEditable(false);
        textField.setText("");
        Pane a1 = new HBox(btn_add,btn_minus,btn_multiply,btn_divide);
        Pane a2 = new HBox(btn_7,btn_8,btn_9,btn_percent);
        Pane a3 = new HBox(btn_4,btn_5,btn_6,btn_power);
        Pane a4 = new HBox(btn_1,btn_2,btn_3,btn_c);
        Pane a5 = new HBox(btn_undo,btn_0,btn_point,btn_equal);
        Pane f = new VBox(textField,a1,a2,a3,a4,a5);
        Scene scene = new Scene(f);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();

        btn_0.setOnAction(e -> {textField.setText(textField.getText()+"0");});
        btn_1.setOnAction(e -> {textField.setText(textField.getText()+"1");});
        btn_2.setOnAction(e -> {textField.setText(textField.getText()+"2");});
        btn_3.setOnAction(e -> {textField.setText(textField.getText()+"3");});
        btn_4.setOnAction(e -> {textField.setText(textField.getText()+"4");});
        btn_5.setOnAction(e -> {textField.setText(textField.getText()+"5");});
        btn_6.setOnAction(e -> {textField.setText(textField.getText()+"6");});
        btn_7.setOnAction(e -> {textField.setText(textField.getText()+"7");});
        btn_8.setOnAction(e -> {textField.setText(textField.getText()+"8");});
        btn_9.setOnAction(e -> {textField.setText(textField.getText()+"9");});
        btn_add.setOnAction(e -> {textField.setText(textField.getText()+"+");});
        btn_minus.setOnAction(e -> {textField.setText(textField.getText()+"-");});
        btn_multiply.setOnAction(e -> {textField.setText(textField.getText()+"*");});
        btn_divide.setOnAction(e -> {textField.setText(textField.getText()+"/");});
        btn_percent.setOnAction(e -> {textField.setText(textField.getText()+"%");});
        btn_c.setOnAction(e -> {textField.setText("");});
        btn_power.setOnAction(e -> {textField.setText(textField.getText()+"^");});
        btn_point.setOnAction(e -> {textField.setText(textField.getText()+".");});
        btn_undo.setOnAction(e -> {textField.setText(textField.getText(0, textField.getLength()-1));});
        btn_equal.setOnAction(e -> {textField.setText(calculate(textField.getText()));});
    }

    public static void main(String[] args) {
        launch();
    }
}