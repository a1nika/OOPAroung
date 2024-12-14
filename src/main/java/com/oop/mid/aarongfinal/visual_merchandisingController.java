package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class visual_merchandisingController {

    @FXML
    private TableColumn<?, ?> budegettablecolumn;

    @FXML
    private TextField budgettextfield;

    @FXML
    private TextField displaytextfield;

    @FXML
    private DatePicker dob1;

    @FXML
    private TableColumn<?, ?> dob1tablecolumn;

    @FXML
    private DatePicker dob2;

    @FXML
    private TableColumn<?, ?> dob2tablecolumn;

    @FXML
    private TableColumn<?, ?> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private TableColumn<?, ?> locationtablecolumn;

    @FXML
    private TextField locationtextfield;

    @FXML
    private TableColumn<?, ?> nametablecolumn;

    @FXML
    private TableColumn<?, ?> themetablecolumn;

    @FXML
    private TextField themetextfield;

    @FXML
    private TableView<?> visualtableview;

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

}
