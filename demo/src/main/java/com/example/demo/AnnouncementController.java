package com.example.demo;

import javafx.fxml.FXML;

public class AnnouncementController implements Controller{

    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
    }
    @FXML
    public void goMember(){
        HelloApplication.changeStage("member-view.fxml");
    }
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
    }
    @FXML
    public void goAnnouncement(){

    }
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }

    @Override
    @FXML
    public void goDashboard() {
        HelloApplication.changeStage("dashboard-view.fxml");
    }

    @FXML
    public void addAnnouncement(){}

    @FXML
    public void editAnnouncement(){}

    @FXML
    public void deleteAnnouncement(){}

    @FXML
    public void nextAnnouncement(){}

    @FXML
    public void previousAnnouncement(){}

    @FXML
    public void sendEmail(){}

}
