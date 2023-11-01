package com.example.demo;

import Util.FileUtil;
import Util.FileUtilT;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TeamEditController {
    @FXML
    private TextField teamName;
    @FXML
    private TextField type;
    @FXML
    private TextField leader;
    @FXML
    private TextField memberList;

    private static Team selected;

    public static void edit(Team selected){
        TeamEditController.selected = selected;
    }

    @FXML
    public void initialize(){
        teamName.setText(selected.getTeamName());
        type.setText(selected.getType());
        leader.setText(selected.getLeader());
        memberList.setText(selected.getMemberList());
    }
    @FXML
    public void addConfirm(){
        Team team = new Team(teamName.getText(), type.getText(), leader.getText(), memberList.getText());
        FileUtilT.editData(team);
    }
}
