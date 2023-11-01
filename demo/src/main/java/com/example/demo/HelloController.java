package com.example.demo;

import Util.FileUtil;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class HelloController {
    @FXML
    private TableView<Member> tableViewM;
    @FXML
    private TableColumn<Member, String> name;
    @FXML
    private TableColumn<Member, String> age;
    @FXML
    private TableColumn<Member, String> gender;
    @FXML
    private TableColumn<Member, String> email;
    @FXML
    private TableColumn<Member, String> phone;
    @FXML
    private TableColumn<Member, String> team;
    @FXML
    public void initialize(){
        getData();
    }

    private void getData(){
        List<Member> members = FileUtil.readData();
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        team.setCellValueFactory(new PropertyValueFactory<>("team"));

        tableViewM.setItems(FXCollections.observableList(members));
    }
    @FXML
    public void showAddM(){
        HelloApplication.addM("addM.fxml");
    }
    @FXML
    public void editMember(){
        Member member = tableViewM.getSelectionModel().getSelectedItem();
        if (member != null){
            MemberEditController.edit(member);
            HelloApplication.addM("editM.fxml");
        }
    }
    @FXML
    public void deleteMember(){
        Member member = tableViewM.getSelectionModel().getSelectedItem();
        if (member != null){
            FileUtil.deleteData(member.getName());
            getData();
        }
    }
    @FXML
    public void refresh(){
        getData();
    }
    @FXML
    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
    }
}