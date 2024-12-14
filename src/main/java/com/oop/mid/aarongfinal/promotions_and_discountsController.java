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

public class promotions_and_discountsController {

    @FXML
    private RadioButton activeradiobtn;

    @FXML
    private TableColumn<Promotion, Double> discounttablecolumn;

    @FXML
    private TextField discounttextfield;

    @FXML
    private DatePicker enddob;

    @FXML
    private TableColumn<Promotion, LocalDate> enddobtablecolumn;

    @FXML
    private TableColumn<Promotion, String> idtablecolumn;

    @FXML
    private TextField idtextfeild;

    @FXML
    private RadioButton inactiveradiobtn;

    @FXML
    private TableColumn<Promotion, String> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private ComboBox<String> productcombobox;

    @FXML
    private TableColumn<Promotion, String> producttablecolumn;

    @FXML
    private TableView<Promotion> promotiontableview;

    @FXML
    private DatePicker startdob;

    @FXML
    private TableColumn<Promotion, LocalDate> startdobtablecolumn;

    @FXML
    private TableColumn<Promotion, String> statustablecolumn;

    private final ObservableList<Promotion> promotionList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBox
        productcombobox.setItems(FXCollections.observableArrayList("Product A", "Product B", "Product C", "Product D"));

        // Set up TableView columns
        idtablecolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nametablecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        producttablecolumn.setCellValueFactory(new PropertyValueFactory<>("product"));
        startdobtablecolumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        enddobtablecolumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        discounttablecolumn.setCellValueFactory(new PropertyValueFactory<>("discount"));
        statustablecolumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        promotiontableview.setItems(promotionList);
    }

    @FXML
    void addbtn(ActionEvent event) {
        String id = idtextfeild.getText().trim();
        String name = nametextfield.getText().trim();
        String product = productcombobox.getValue();
        LocalDate startDate = startdob.getValue();
        LocalDate endDate = enddob.getValue();
        String discountText = discounttextfield.getText().trim();
        String status = activeradiobtn.isSelected() ? "Active" : inactiveradiobtn.isSelected() ? "Inactive" : null;

        if (id.isEmpty() || name.isEmpty() || product == null || startDate == null || endDate == null || discountText.isEmpty() || status == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled!");
            return;
        }

        try {
            double discount = Double.parseDouble(discountText);
            if (discount < 0 || discount > 100) {
                showAlert(Alert.AlertType.ERROR, "Input Error", "Discount must be between 0 and 100.");
                return;
            }

            Promotion promotion = new Promotion(id, name, product, startDate, endDate, discount, status);
            promotionList.add(promotion);

            clearFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Promotion added successfully!");
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Discount must be a valid number.");
        }
    }

    private void clearFields() {
        idtextfeild.clear();
        nametextfield.clear();
        productcombobox.setValue(null);
        startdob.setValue(null);
        enddob.setValue(null);
        discounttextfield.clear();
        activeradiobtn.setSelected(false);
        inactiveradiobtn.setSelected(false);
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }


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
