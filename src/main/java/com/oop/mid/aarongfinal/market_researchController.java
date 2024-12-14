package com.oop.mid.aarongfinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;

public class market_researchController {

    @FXML
    private TableColumn<MarketResearch, String> adudiencetablecolumn;

    @FXML
    private RadioButton adultradiobutton;

    @FXML
    private TableColumn<MarketResearch, String> competitortablecolumn;

    @FXML
    private TextField competitortextfield;

    @FXML
    private TextField descriptiontextfield;

    @FXML
    private DatePicker dob;

    @FXML
    private TableColumn<MarketResearch, LocalDate> dobtablecolumn;

    @FXML
    private TableColumn<MarketResearch, String> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private TableView<MarketResearch> markettableview;

    @FXML
    private TableColumn<MarketResearch, String> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private RadioButton professionalsradiobutton;

    @FXML
    private TableColumn<MarketResearch, String> resiontablecolumn;

    @FXML
    private ComboBox<String> targetcombobox;

    @FXML
    private RadioButton teenradiobutton;

    private final ObservableList<MarketResearch> marketList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBox
        targetcombobox.setItems(FXCollections.observableArrayList("North America", "Europe", "Asia", "Australia", "Africa"));

        // Set up TableView columns
        idtablecolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nametablecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dobtablecolumn.setCellValueFactory(new PropertyValueFactory<>("dob"));
        competitortablecolumn.setCellValueFactory(new PropertyValueFactory<>("competitor"));
        adudiencetablecolumn.setCellValueFactory(new PropertyValueFactory<>("audience"));
        resiontablecolumn.setCellValueFactory(new PropertyValueFactory<>("targetRegion"));

        markettableview.setItems(marketList);
    }

    @FXML
    void addbtn(ActionEvent event) {
        String id = idtextfeild.getText().trim();
        String name = nametextfield.getText().trim();
        LocalDate dateOfBirth = dob.getValue();
        String competitor = competitortextfield.getText().trim();
        String description = descriptiontextfield.getText().trim();
        String audience = null;
        if (adultradiobutton.isSelected()) audience = "Adults";
        else if (teenradiobutton.isSelected()) audience = "Teens";
        else if (professionalsradiobutton.isSelected()) audience = "Professionals";
        String targetRegion = targetcombobox.getValue();

        if (id.isEmpty() || name.isEmpty() || dateOfBirth == null || competitor.isEmpty()
                || description.isEmpty() || audience == null || targetRegion == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled!");
            return;
        }

        MarketResearch marketResearch = new MarketResearch(id, name, dateOfBirth, competitor, description, audience, targetRegion);
        marketList.add(marketResearch);

        clearFields();
        showAlert(Alert.AlertType.INFORMATION, "Success", "Market research data added successfully!");
    }

    @FXML
    void teenbtn(ActionEvent event) {
        ObservableList<MarketResearch> filteredList = FXCollections.observableArrayList();
        for (MarketResearch mr : marketList) {
            if ("Teens".equals(mr.getAudience())) {
                filteredList.add(mr);
            }
        }
        markettableview.setItems(filteredList);
    }

    @FXML
    void professionbtn(ActionEvent event) {
        ObservableList<MarketResearch> filteredList = FXCollections.observableArrayList();
        for (MarketResearch mr : marketList) {
            if ("Professionals".equals(mr.getAudience())) {
                filteredList.add(mr);
            }
        }
        markettableview.setItems(filteredList);
    }

    private void clearFields() {
        idtextfeild.clear();
        nametextfield.clear();
        dob.setValue(null);
        competitortextfield.clear();
        descriptiontextfield.clear();
        adultradiobutton.setSelected(false);
        teenradiobutton.setSelected(false);
        professionalsradiobutton.setSelected(false);
        targetcombobox.setValue(null);
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
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
    void logoutbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }


}

