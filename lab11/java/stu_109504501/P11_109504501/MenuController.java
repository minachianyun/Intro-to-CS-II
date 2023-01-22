package stu_109504501.P11_109504501;

import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {
    @FXML
    public void onStartPressed() throws IOException {
        HelloApplication.mazeScene.getRoot().requestFocus(); // 讓mazeScene的root(VBox)拿到focus，待會鍵盤事件才抓得到方向鍵
        HelloApplication.currentStage.setScene(HelloApplication.mazeScene);
    }

    @FXML
    public void onExitPressed() throws IOException{
        HelloApplication.currentStage.close();
    }
}
