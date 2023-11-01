package com.example.demo;

import Util.FileUtil;
import Util.FileUtilT;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TeamAddController {
    @FXML
    private TextField name;
    @FXML
    private TextField type;
    @FXML
    private TextField leader;
    @FXML
    private TextField memberList;
    @FXML
    public void initialize(){

    }
    @FXML
    public void addConfirm(){
        Team team = new Team(name.getText(), type.getText(), leader.getText(), memberList.getText());
        FileUtilT.addData(team);
    }
}
