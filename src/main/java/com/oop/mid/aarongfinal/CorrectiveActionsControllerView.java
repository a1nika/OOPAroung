package com.oop.mid.aarongfinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CorrectiveActionsControllerView {

    @FXML
    private TableView<CorrectiveActions> correctiveactionstable;

    @FXML
    private TableColumn<CorrectiveActions, String> requirementscolumnview;

    @FXML
    private TextField requirementstextfield;

    @FXML
    private TableColumn<CorrectiveActions, String> risklevelcolumnview;

    @FXML
    private TextField riskleveltextfield;

    @FXML
    private TableColumn<CorrectiveActions, String> statuscolumnview;

    @FXML
    private TextField statustextfield;

    private ObservableList<CorrectiveActions> correctiveActionsList = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Set up table columns
        requirementscolumnview.setCellValueFactory(new PropertyValueFactory<>("requirement"));
        risklevelcolumnview.setCellValueFactory(new PropertyValueFactory<>("riskLevel"));
        statuscolumnview.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Set the table's items
        correctiveactionstable.setItems(correctiveActionsList);
    }

    @FXML
    void addcomplianceassessmentreportbtn(ActionEvent event) {
        // Get values from text fields
        String requirement = requirementstextfield.getText();
        String riskLevel = riskleveltextfield.getText();
        String status = statustextfield.getText();

        // Add a new CorrectiveAction to the list
        if (!requirement.isEmpty() && !riskLevel.isEmpty() && !status.isEmpty()) {
            CorrectiveActions newAction = new CorrectiveActions(requirement, riskLevel, status);
            correctiveActionsList.add(newAction);

            // Clear text fields
            requirementstextfield.clear();
            riskleveltextfield.clear();
            statustextfield.clear();
        }
    }

    @FXML
    void backbtn(ActionEvent event) {
        // Add logic for the back button if needed
    }
}