package com.example.demo;

import Util.FileUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MemberAddController implements Add{
    @FXML
    private TextField name;
    @FXML
    private TextField age;
    @FXML
    private TextField gender;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private TextField team;
    @FXML
    public void initialize(){

    }
    @FXML
    public void addConfirm(){
        Member member = new Member(name.getText(), age.getText(), gender.getText(), email.getText(), phone.getText(), team.getText());
        FileUtil.addData(member);
    }
}
