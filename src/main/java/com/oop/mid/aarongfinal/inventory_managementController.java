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

public class inventory_managementController {

    @FXML
    private DatePicker allocationdatePicker;

    @FXML
    private TableColumn<InventoryItem, String> catagorytablecolumn;

    @FXML
    private ComboBox<String> categorycombobox;

    @FXML
    private TableColumn<InventoryItem, LocalDate> dobtablecolumn;

    @FXML
    private TableColumn<InventoryItem, String> idtablecolumn;

    @FXML
    private TextField idtextfield;

    @FXML
    private TableColumn<InventoryItem, String> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private TableView<InventoryItem> productinfotableview;

    private final ObservableList<InventoryItem> inventoryList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBox
        categorycombobox.setItems(FXCollections.observableArrayList("Electronics", "Apparel", "Food", "Furniture"));

        // Set up TableView columns
        idtablecolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nametablecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        catagorytablecolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        dobtablecolumn.setCellValueFactory(new PropertyValueFactory<>("allocationDate"));

        productinfotableview.setItems(inventoryList);
    }

    @FXML
    void addbtn(ActionEvent event) {
        String id = idtextfield.getText().trim();
        String name = nametextfield.getText().trim();
        String category = categorycombobox.getValue();
        LocalDate allocationDate = allocationdatePicker.getValue();

        if (id.isEmpty() || name.isEmpty() || category == null || allocationDate == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled!");
            return;
        }

        InventoryItem item = new InventoryItem(id, name, category, allocationDate);
        inventoryList.add(item);

        clearFields();
        showAlert(Alert.AlertType.INFORMATION, "Success", "Item added successfully!");
    }

    @FXML
    void removeonactionbutton(ActionEvent event) {
        InventoryItem selectedItem = productinfotableview.getSelectionModel().getSelectedItem();
        if (selectedItem == null) {
            showAlert(Alert.AlertType.ERROR, "Selection Error", "No item selected to remove.");
            return;
        }

        inventoryList.remove(selectedItem);
        showAlert(Alert.AlertType.INFORMATION, "Success", "Item removed successfully!");
    }

    @FXML
    void clearbuttononactionbutton(ActionEvent event) {
        inventoryList.clear();
        showAlert(Alert.AlertType.INFORMATION, "Success", "All items cleared from the table.");
    }

    @FXML
    void logoutbtn(ActionEvent event)  throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    @FXML
    void returnbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("head_of_retail_dashb.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    private void clearFields() {
        idtextfield.clear();
        nametextfield.clear();
        categorycombobox.setValue(null);
        allocationdatePicker.setValue(null);
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }



}
