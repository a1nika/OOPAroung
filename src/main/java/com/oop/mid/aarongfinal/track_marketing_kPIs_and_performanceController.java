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

public class track_marketing_kPIs_and_performanceController {

    @FXML
    private TableView<?> Trackkpitableview;

    @FXML
    private TextField budgettextfeild1;

    @FXML
    private RadioButton clickradiobtn;

    @FXML
    private RadioButton conversionradiobtn;

    @FXML
    private DatePicker enddob;

    @FXML
    private TableColumn<?, ?> enddobtablecolumn;

    @FXML
    private TableColumn<?, ?> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private RadioButton impressionradiobtn;

    @FXML
    private TableColumn<?, ?> kpitablecolumn;

    @FXML
    private TableColumn<?, ?> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private RadioButton returnradiobtn;

    @FXML
    private DatePicker startdob;

    @FXML
    private TableColumn<?, ?> startdobtablecolumn;

    @FXML
    private TableColumn<?, ?> statustablecolumn;

    @FXML
    private TableColumn<?, ?> targettablecolumn;

    @FXML
    private TextField targettextfield;

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
    void clickbtn(ActionEvent event) {

    }

    @FXML
    void conversionbtn(ActionEvent event) {

    }

    @FXML
    void impressionbtn(ActionEvent event) {

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
    void returnbtn(ActionEvent event) {

    }

}
