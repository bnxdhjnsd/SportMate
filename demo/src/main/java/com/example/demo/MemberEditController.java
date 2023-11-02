package com.example.demo;

import Util.FileUtil;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MemberEditController implements Edit{
    @FXML
    private TextField name;
    @FXML
    private TextField age;
    @FXML
    private ChoiceBox<String> gender;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private TextField team;

    private static Member selected;

    public static void edit(Member selected){
        MemberEditController.selected = selected;
    }

    @FXML
    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("male", "female");
        name.setText(selected.getName());
        age.setText(selected.getAge());
        gender.setValue(selected.getGender());
        email.setText(selected.getEmail());
        phone.setText(selected.getPhone());
        team.setText(selected.getTeam());
    }
    @FXML
    public void addConfirm(){
        Member member = new Member(name.getText(), age.getText(), gender.getValue(), email.getText(), phone.getText(), team.getText());
        FileUtil.editData(member);
    }
}
