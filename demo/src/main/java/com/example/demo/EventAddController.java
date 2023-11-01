package com.example.demo;

import Util.FileUtilE;
import Util.FileUtilT;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class EventAddController {
    @FXML
    private TextField eventName;
    @FXML
    private TextField eventType;
    @FXML
    private TextField time;
    @FXML
    private TextField loca;
    @FXML
    public void initialize(){

    }
    @FXML
    public void addConfirm(){
        Event event = new Event(eventName.getText(), eventType.getText(), time.getText(), loca.getText());
        FileUtilE.addData(event);
    }
}
