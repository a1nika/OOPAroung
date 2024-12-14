package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class assist_customers_with_purchasesController {

    @FXML
    private TextField addresstextfield;

    @FXML
    private TableView<?> assistcustomertableview;

    @FXML
    private DatePicker dob;

    @FXML
    private TableColumn<?, ?> dobtablecolumn;

    @FXML
    private TableColumn<?, ?> emaintablecolumn;

    @FXML
    private TableColumn<?, ?> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private TableColumn<?, ?> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private ComboBox<?> paymentcombobox;

    @FXML
    private TableColumn<?, ?> paymenttablecolumn;

    @FXML
    private TableColumn<?, ?> phonetablecolumn;

    @FXML
    private TextField phonetextfield;

    @FXML
    private TableColumn<?, ?> producttablecolumn;

    @FXML
    private TextField producttextfield1;

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
    void bankbtn(ActionEvent event) {

    }

    @FXML
    void cashbtn(ActionEvent event) {

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
    void onlinebtn(ActionEvent event) {

    }

}
