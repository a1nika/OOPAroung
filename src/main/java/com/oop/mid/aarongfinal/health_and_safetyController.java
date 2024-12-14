package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class health_and_safetyController {

    @FXML
    private TableColumn<?, ?> descriptiontablecolumn;

    @FXML
    private TextField descriptiontextfield;

    @FXML
    private DatePicker dob;

    @FXML
    private TableColumn<?, ?> dobtablecolumn;

    @FXML
    private TableView<?> healthtableview;

    @FXML
    private RadioButton highradiobtn1;

    @FXML
    private TableColumn<?, ?> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private TableColumn<?, ?> incidenttablecolumn;

    @FXML
    private TextField incidenttextfield;

    @FXML
    private TableColumn<?, ?> locationtablecolumn;

    @FXML
    private TextField locationtextfield;

    @FXML
    private RadioButton lowradiobtn;

    @FXML
    private RadioButton mediumradiobtn;

    @FXML
    private TableColumn<?, ?> reportedtablecolumn;

    @FXML
    private TextField reprtedtextfield;

    @FXML
    private TableColumn<?, ?> severitytablecolumn;

    @FXML
    private AnchorPane warningtextarea;

    @FXML
    void addbtn(ActionEvent event) {

    }

    @FXML
    void backbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("head_of_retail_dashb.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void logoutbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void showlowbtn(ActionEvent event) {

    }

    @FXML
    void showmediumbtn(ActionEvent event) {

    }

}

