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

import java.io.IOException;

public class BrowseProductController {

    @FXML
    private Label browseproductlabel;

    @FXML
    private TableColumn<BrowseProduct, String> productnamecolumn;

    @FXML
    private TableColumn<BrowseProduct, String> categorycolumn;

    @FXML
    private TableColumn<BrowseProduct, String> pricecolumn;

    @FXML
    private TableColumn<BrowseProduct, String> sizecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private ComboBox<String> categorycombobox;

    @FXML
    private ComboBox<String> pricecombobox;

    @FXML
    private TextField sizetextfield;

    @FXML
    private TableView<BrowseProduct> productdetailstableview;

    // ObservableList to hold the product data
    private final ObservableList<BrowseProduct> productList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        categorycombobox.getItems().addAll("Men's Wear", "Women's Wear", "Kid's Wear", "Jewellary");
        pricecombobox.getItems().addAll("$0 - $50", "$51 - $100", "$101 - $200", "Above $200");
        productnamecolumn.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        categorycolumn.setCellValueFactory(new PropertyValueFactory<>("Category"));
        pricecolumn.setCellValueFactory(new PropertyValueFactory<>("Price"));
        sizecolumn.setCellValueFactory(new PropertyValueFactory<>("Size"));
        productdetailstableview.setItems(productList);
    }

    @FXML
    void addbtn(ActionEvent event) {
        // Retrieve input values
        String productName = productnametextfield.getText().trim();
        String category = categorycombobox.getValue();
        String price = pricecombobox.getValue();
        String size = sizetextfield.getText().trim();

        // Validate inputs
        if (productName.isEmpty() || category == null || price == null || size.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled out!");
            return;
        }

        // Add the new product to the table
        BrowseProduct newProduct = new BrowseProduct(productName, category, price, size);
        productList.add(newProduct);

        // Clear input fields
        clearInputFields();
        showAlert(Alert.AlertType.INFORMATION, "Success", "Product added successfully!");
    }

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard_Customer.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    // Utility method to clear input fields
    private void clearInputFields() {
        productnametextfield.clear();
        categorycombobox.setValue(null);
        pricecombobox.setValue(null);
        sizetextfield.clear();
    }

    // Utility method to display alerts
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
