package stu_109504501.P11_109504501;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MazeController implements EventHandler<KeyEvent> {
    int rowIndex = 0;
    int columnIndex = 0;

    @FXML
    GridPane maze;
    @FXML
    Pane man;
    @FXML
    Label successLabel;
    @FXML
    Button backButton;

    @FXML
    public void onBackPressed() throws IOException {
        HelloApplication.currentStage.setScene(HelloApplication.menuScene);
    }

    @Override
    public void handle(KeyEvent e) {
        System.out.println(e.getCode());

        if(e.getCode() == KeyCode.SPACE){
            rowIndex = 0;
            columnIndex = 0;
            successLabel.setVisible(false);
        }

        if(rowIndex == 4 && columnIndex == 4){
            successLabel.setVisible(true);
        }
        else if(e.getCode() == KeyCode.DOWN){
            rowIndex++;
            if(rowIndex == 4 && columnIndex == 4){
                successLabel.setVisible(true);
            }
        }
        else if(e.getCode() == KeyCode.UP){
            rowIndex--;
            if(rowIndex == 4 && columnIndex == 4){
                successLabel.setVisible(true);
            }
        }
        else if(e.getCode() == KeyCode.RIGHT){
            columnIndex++;
            if(rowIndex == 4 && columnIndex == 4){
                successLabel.setVisible(true);
            }
        }
        else if(e.getCode() == KeyCode.LEFT){
            columnIndex--;
            if(rowIndex == 4 && columnIndex == 4){
                successLabel.setVisible(true);
            }
        }
        walkToNewPosition();
    }

    private void walkToNewPosition(){
        int maxRowIndex = maze.getRowCount() - 1;
        int maxColumnIndex = maze.getColumnCount() - 1;

        if(rowIndex < 0){
            rowIndex = 0;
        }
        if(rowIndex > maxRowIndex){
            rowIndex = maxRowIndex;
        }

        if(columnIndex < 0){
            columnIndex = 0;
        }
        if(columnIndex > maxColumnIndex){
            columnIndex = maxColumnIndex;
        }

        GridPane.setRowIndex(man, rowIndex);
        GridPane.setColumnIndex(man, columnIndex);
    }


}