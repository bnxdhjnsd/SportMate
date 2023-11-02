package com.example.demo;

import Util.FileUtil;
import Util.FileUtilT;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class TeamController {
    @FXML
    private TableView<Team> tableViewT;
    @FXML
    private TableColumn<Member, String> teamName;
    @FXML
    private TableColumn<Member, String> type;
    @FXML
    private TableColumn<Member, String> leader;
    @FXML
    private TableColumn<Member, String> memberList;

    public void initialize(){
        getData();
    }

    private void getData(){
        List<Team> teams = FileUtilT.readData();
        teamName.setCellValueFactory(new PropertyValueFactory<>("teamName"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        leader.setCellValueFactory(new PropertyValueFactory<>("leader"));
        memberList.setCellValueFactory(new PropertyValueFactory<>("memberList"));

        tableViewT.setItems(FXCollections.observableList(teams));
    }
    @FXML
    public void showAddT(){
        HelloApplication.addT("addT.fxml");
    }
    @FXML
    public void editTeam(){
        Team team = tableViewT.getSelectionModel().getSelectedItem();
        if (team != null){
            TeamEditController.edit(team);
            HelloApplication.addT("editT.fxml");
        }
    }
    @FXML
    public void deleteTeam(){
        Team team = tableViewT.getSelectionModel().getSelectedItem();
        if (team != null){
            FileUtilT.deleteData(team.getTeamName());
            getData();
        }
    }
    @FXML
    public void refresh(){
        getData();
    }
    @FXML
    public void goMember(){
        HelloApplication.changeStage("hello-view.fxml");
    }
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
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
    @FXML
    public void goDashboard(){
        HelloApplication.changeStage("dashboard-view.fxml");
    }
}
