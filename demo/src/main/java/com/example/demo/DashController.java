package com.example.demo;

import javafx.fxml.FXML;

public class DashController {
    @FXML
    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
    }
    @FXML
    public void goMember(){
        HelloApplication.changeStage("hello-view.fxml");
    }
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
    }
    @FXML
    public void goAnnouncement(){
        HelloApplication.changeStage("announcement-view.fxml");
    }
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }
}
