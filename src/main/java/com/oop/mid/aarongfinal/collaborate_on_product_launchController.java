package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class collaborate_on_product_launchController {

    @FXML
    private RadioButton adultradiobutton;

    @FXML
    private TableColumn<?, ?> assigntablecolumn;

    @FXML
    private TableView<?> collaboratetableview;

    @FXML
    private TextField competitortextfield;

    @FXML
    private TableColumn<?, ?> descriptiontablecolumn;

    @FXML
    private TextField descriptiontextfield;

    @FXML
    private DatePicker dob;

    @FXML
    private TableColumn<?, ?> dobtablecolumn;

    @FXML
    private TableColumn<?, ?> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private TableColumn<?, ?> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private TableColumn<?, ?> prioritytablecolumn;

    @FXML
    private RadioButton professionalsradiobutton;

    @FXML
    private TableColumn<?, ?> statustablecolumn;

    @FXML
    private ComboBox<?> targetcombobox;

    @FXML
    private RadioButton teenradiobutton;

    @FXML
    private AnchorPane warningtextarea;

    @FXML
    void addbtn(ActionEvent event) {

    }

    @FXML
    void backbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("marketing_manager_dashb.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void highbtn(ActionEvent event) {

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
    void lowbtn(ActionEvent event) {

    }

    @FXML
    void mediumbtn(ActionEvent event) {

    }

}