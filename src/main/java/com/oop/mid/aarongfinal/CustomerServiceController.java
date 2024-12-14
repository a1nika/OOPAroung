package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerServiceController {

    @FXML
    private TableColumn<?, ?> addresscolumn;

    @FXML
    private TextArea addresstextfield;

    @FXML
    private TableColumn<?, ?> contactnocolumn;

    @FXML
    private TextField contactnotextfield;

    @FXML
    private TableColumn<?, ?> customeridcolumn;

    @FXML
    private TextField customeridtextfield;

    @FXML
    private TableColumn<?, ?> customernamecolumn;

    @FXML
    private TextField customernametextfield;

    @FXML
    private Label customerservicelabel;

    @FXML
    private TableColumn<?, ?> emailcolumn;

    @FXML
    private TextField emailtextfield;

    @FXML
    private TextArea messagetextfield;

    @FXML
    private ComboBox<?> messagetypecombobox;

    @FXML
    private TableView<?> productdetailstableview;

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
    void sendmessagebtn(ActionEvent event) {

    }

}
