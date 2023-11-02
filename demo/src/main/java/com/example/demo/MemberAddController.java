package com.example.demo;

import Util.FileUtil;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * The 'MemberAddController' class is responsible for the function of adding a new member in the app.
 */
public class MemberAddController implements Add{
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

    /**
     * Initialize the Member Add View, setting the gender choice options to male and female.
     */
    @FXML
    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("male", "female");
    }

    /**
     * Add the Member info to data, connected to conform button.
     */
    @FXML
    public void addConfirm(){
        Member member = new Member(name.getText(), age.getText(), gender.getValue(), email.getText(), phone.getText(), team.getText());
        FileUtil.addData(member);
    }
}
