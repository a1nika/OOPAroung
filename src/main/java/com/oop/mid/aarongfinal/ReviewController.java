package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ReviewController {

    @FXML
    private TableColumn<?, ?> customernamecolumn;

    @FXML
    private TextField customernametextfield;

    @FXML
    private RadioButton fiveradiobutton;

    @FXML
    private RadioButton fourradiobutton;

    @FXML
    private RadioButton oneradiobutton;

    @FXML
    private TableColumn<?, ?> orderidcolumn;

    @FXML
    private TextField orderidtextfield;

    @FXML
    private TableView<?> productdetailstableview;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableColumn<?, ?> purchasedatecolumn;

    @FXML
    private TextField purchasedatetextfield;

    @FXML
    private Label reviewlabel;

    @FXML
    private TextArea reviewtextfield;

    @FXML
    private RadioButton threeradiobutton;

    @FXML
    private RadioButton tworadiobutton;

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard_Customer.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void submitreviewbtn(ActionEvent event) {

    }

}

