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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TrackOrdersController {

    @FXML
    private RadioButton cancelledradiobutton;

    @FXML
    private TableColumn<?, ?> customernamecolumn;

    @FXML
    private TextField customernametextfield;

    @FXML
    private TextField datetextfield;

    @FXML
    private RadioButton deliveredradiobutton;

    @FXML
    private TableColumn<?, ?> orderidcolumn;

    @FXML
    private TextField orderidtextfield;

    @FXML
    private RadioButton pendingradiobutton;

    @FXML
    private TableView<?> productdetailstableview;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableColumn<?, ?> productpricecolumn;

    @FXML
    private TextField productpricetextfield;

    @FXML
    private TableColumn<?, ?> quantitycolumn;

    @FXML
    private TextField quantitytextfield;

    @FXML
    private RadioButton shippedradiobutton;

    @FXML
    private TableColumn<?, ?> totalamountcolumn;

    @FXML
    private TextField totalamounttextfield;

    @FXML
    private Label trackorderslabel;

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
    void cancelorderbtn(ActionEvent event) {

    }

    @FXML
    void contactsupportbtn(ActionEvent event) {

    }

}

