package com.example.demo;

import Util.FileUtilE;
import Util.FileUtilT;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EventAddController implements Add{
    @FXML
    private TextField eventName;
    @FXML
    private TextField eventType;
    @FXML
    private DatePicker time;
    @FXML
    private TextField loca;
    @FXML
    public void initialize(){

    }
    @FXML
    public void addConfirm(){
        Event event = new Event(eventName.getText(), eventType.getText(), time.getEditor().getText(), loca.getText());
        FileUtilE.addData(event);
    }
}
