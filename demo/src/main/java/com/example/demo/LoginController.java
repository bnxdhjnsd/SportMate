package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField account;
    @FXML
    private TextField password;
    @FXML
    private Label error;
    @FXML
    public void initialize(){

    }
    @FXML
    public void login(){
        String acc = account.getText();
        String pass = password.getText();
        if (StringUtil.isEmpty(acc)){
            error.setText("Acc cannot be empty.");
            error.setVisible(true);
            return;
        }
        if (StringUtil.isEmpty(pass)){
            error.setText("Password cannot be empty.");
            error.setVisible(true);
            return;
        }
        if (acc.equals("123") && pass.equals("123")){
            HelloApplication.changeStage("hello-view.fxml");
        }else {
            error.setText("Wrong acc/password.");
            error.setVisible(true);
        }
    }
}
