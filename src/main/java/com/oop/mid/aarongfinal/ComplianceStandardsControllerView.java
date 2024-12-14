package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class ComplianceStandardsControllerView {

    @FXML
    private ComboBox<String> industrycombobox;

    @FXML
    private ComboBox<String> productcategorycombobox;

    @FXML
    private ComboBox<String> regioncombobox;


    // Method to initialize the ComboBoxes with data
    @FXML
    public void initialize() {
        // Populate the Product Category ComboBox
        productcategorycombobox.getItems().addAll("Electronics", "Clothing", "Furniture", "Food");

        // Populate the Industry ComboBox
        industrycombobox.getItems().addAll("Retail", "Manufacturing", "Healthcare", "Technology");

        // Populate the Region ComboBox
        regioncombobox.getItems().addAll("Mohammadpur", "Dhanmondi", "Gulshan", "Uttara");
    }

    public void applyfiltersbtn(ActionEvent actionEvent)  {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("corrective_actions.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }

    }

    public void backbtn(ActionEvent actionEvent)  {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("quality-manager-dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }
    }

    }

