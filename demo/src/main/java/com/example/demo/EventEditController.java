package com.example.demo;

import Util.FileUtilE;
import Util.FileUtilT;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EventEditController implements Edit{
    @FXML
    private TextField eventName;
    @FXML
    private TextField eventType;
    @FXML
    private DatePicker time;
    @FXML
    private TextField loca;

    private static Event selected;

    public static void edit(Event selected){
        EventEditController.selected = selected;
    }

    @FXML
    public void initialize(){
        eventName.setText(selected.getEventName());
        eventType.setText(selected.getEventType());
        time.getEditor().setText(selected.getTime());
        loca.setText(selected.getLoca());
    }
    @FXML
    public void addConfirm(){
        Event event = new Event(eventName.getText(), eventType.getText(), time.getEditor().getText(), loca.getText());
        FileUtilE.editData(event);
    }
}
