package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * The 'LoginController' class is the entry of a JavaFX application called "SportMate".
 * The class provides method to allow users to input account and password to access the content of the application.
 * @version 1.0
 * @since 17.0
 */
public class LoginController {
    @FXML
    private TextField account;
    @FXML
    private TextField password;
    @FXML
    private Label error;

    /**
     * The method is called when related FXML file is initialized.
     */
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
            HelloApplication.changeStage("dashboard-view.fxml");
        }else {
            error.setText("Wrong acc/password.");
            error.setVisible(true);
        }
    }
}
