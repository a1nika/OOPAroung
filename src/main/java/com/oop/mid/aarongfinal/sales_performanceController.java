package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class sales_performanceController {

    @FXML
    private TableColumn<?, ?> achivementtableview;

    @FXML
    private TextField achivementtextfield;

    @FXML
    private Button addbtn;

    @FXML
    private TableColumn<?, ?> feedbacktableview;

    @FXML
    private TextField feedbacktextfield;

    @FXML
    private TableColumn<?, ?> monthlysalestableview;

    @FXML
    private TextField nametextfield;

    @FXML
    private ComboBox<?> performancecombobox;

    @FXML
    private ComboBox<?> productcombobox;

    @FXML
    private TableColumn<?, ?> producttableview;

    @FXML
    private TableColumn<?, ?> ratingtableview;

    @FXML
    private TableColumn<?, ?> revenuetableview;

    @FXML
    private TextField revenuetextfield;

    @FXML
    private TableView<?> salesperformancetableview;

    @FXML
    private TableColumn<?, ?> salespersontablecolumn;

    @FXML
    private TextField salestextfield;

    @FXML
    private TextField soldtextfield;

    @FXML
    private TableColumn<?, ?> targettableview;

    @FXML
    private TextField targettextfield;

    @FXML
    private TableColumn<?, ?> unittableview;

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
