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

public class AddRemoveProductController {

    @FXML
    private Label addandremovelabel;

    @FXML
    private TableView<AddRemoveProducts> productdetailstableview;

    @FXML
    private TableColumn<AddRemoveProductController, String> productidcolumn;

    @FXML
    private TableColumn<AddRemoveProducts, String> productnamecolumn;

    @FXML
    private TableColumn<AddRemoveProducts, String> categorycolumn;

    @FXML
    private TableColumn<AddRemoveProducts, String> sizecolumn;

    @FXML
    private TableColumn<AddRemoveProducts, Integer> quantitycolumn;

    @FXML
    private TableColumn<AddRemoveProducts, Double> pricecolumn;

    @FXML
    private TextField productidtextfield;

    @FXML
    private TextField productnametextfield;

    @FXML
    private ComboBox<String> categorycombobox;

    @FXML
    private TextField sizetextfield;

    @FXML
    private TextField quantitytextfield;

    @FXML
    private TextField pricetextfield;

    // Observable list to store Product data
    private final ObservableList<AddRemoveProducts> productList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate category ComboBox
        categorycombobox.getItems().addAll("Men's Wear", "Women's Wear", "Kid's Wear", "Jewellery");

        // Set up TableView columns
        productidcolumn.setCellValueFactory(new PropertyValueFactory<>("productId"));
        productnamecolumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        categorycolumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        sizecolumn.setCellValueFactory(new PropertyValueFactory<>("size"));
        quantitycolumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        pricecolumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Bind the observable list to the TableView
        productdetailstableview.setItems(productList);
    }

    @FXML
    void addproductbtn(ActionEvent event) {
        // Retrieve inputs
        String productId = productidtextfield.getText().trim();
        String productName = productnametextfield.getText().trim();
        String category = categorycombobox.getValue();
        String size = sizetextfield.getText().trim();
        String quantityStr = quantitytextfield.getText().trim();
        String priceStr = pricetextfield.getText().trim();

        // Validate inputs
        if (productId.isEmpty() || productName.isEmpty() || category == null || size.isEmpty()
                || quantityStr.isEmpty() || priceStr.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled out!");
            return;
        }

        try {
            int quantity = Integer.parseInt(quantityStr);
            double price = Double.parseDouble(priceStr);

            // Add the product to the table
            AddRemoveProducts newProduct = new AddRemoveProducts(productId, productName, category, size, quantity, price);
            productList.add(newProduct);

            clearInputFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Product added successfully!");

        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Quantity must be an integer and Price must be a number!");
        }
    }

    @FXML
    void removeproductbtn(ActionEvent event) {
        // Get the selected product
        AddRemoveProducts selectedProduct = productdetailstableview.getSelectionModel().getSelectedItem();

        if (selectedProduct != null) {
            // Remove the selected product
            productList.remove(selectedProduct);
            showAlert(Alert.AlertType.INFORMATION, "Success", "Product removed successfully!");
        } else {
            showAlert(Alert.AlertType.WARNING, "Selection Error", "Please select a product to remove.");
        }
    }

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Product Development Manager/Collaborating_With_Marketing.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    // Method to clear input fields
    private void clearInputFields() {
        productidtextfield.clear();
        productnametextfield.clear();
        categorycombobox.setValue(null);
        sizetextfield.clear();
        quantitytextfield.clear();
        pricetextfield.clear();
    }

    // Method to show alert messages
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
