package com.example.demo;

import Util.FileUtilE;
import Util.FileUtilT;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class EventController {
    @FXML
    private TableView<Event> tableViewE;
    @FXML
    private TableColumn<Event, String> eventName;
    @FXML
    private TableColumn<Event, String> eventType;
    @FXML
    private TableColumn<Event, String> time;
    @FXML
    private TableColumn<Event, String> loca;

    public void initialize(){
        getData();
    }

    private void getData(){
        List<Event> events = FileUtilE.readData();
        eventName.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventType.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        time.setCellValueFactory(new PropertyValueFactory<>("time"));
        loca.setCellValueFactory(new PropertyValueFactory<>("loca"));

        tableViewE.setItems(FXCollections.observableList(events));
    }
    @FXML
    public void showAddE(){
        HelloApplication.addE("addE.fxml");
    }
    @FXML
    public void editEvent(){
        Event event = tableViewE.getSelectionModel().getSelectedItem();
        if (event != null){
            EventEditController.edit(event);
            HelloApplication.addE("editE.fxml");
        }
    }
    @FXML
    public void deleteEvent(){
        Event event = tableViewE.getSelectionModel().getSelectedItem();
        if (event != null){
            FileUtilE.deleteData(event.getEventName());
            getData();
        }
    }
    @FXML
    public void refresh(){
        getData();
    }
    @FXML
    public void goMember(){
        HelloApplication.changeStage("member-view.fxml");
    }
    @FXML
    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }

    @FXML
    public void goAnnouncement(){
        HelloApplication.changeStage("announcement-view.fxml");
    }
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }
    @FXML
    public void goDashboard(){
        HelloApplication.changeStage("dashboard-view.fxml");
    }
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
    }
}
