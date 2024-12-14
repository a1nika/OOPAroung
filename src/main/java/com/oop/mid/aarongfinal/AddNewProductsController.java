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

public class AddNewProductsController {

    @FXML
    private Label addnewproductlabel;

    @FXML
    private TableView<AddNewProducts> addnewproducttableview;

    @FXML
    private TableColumn<AddNewProducts, String> productnamecolumn;

    @FXML
    private TableColumn<AddNewProducts, String> productidcolumn;

    @FXML
    private TableColumn<AddNewProducts, String> categorycolumn;

    @FXML
    private TableColumn<AddNewProducts, String> suppliernamecolumn;

    @FXML
    private TableColumn<AddNewProducts, String> initialquantitystockcolumn;

    @FXML
    private TableColumn<AddNewProducts, String> unitpricecolumn;

    @FXML
    private TableColumn<AddNewProducts, String> reorderlevelcolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TextField productidtextfield;

    @FXML
    private ComboBox<String> categorycombobox;

    @FXML
    private TextField suppliernametextfield;

    @FXML
    private TextField initialstockquantitytextfield;

    @FXML
    private TextField unitpricetextfield;

    @FXML
    private TextField reorderleveltextfield;

    // ObservableList to hold products
    private final ObservableList<AddNewProducts> AddNewProductList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate ComboBox with sample categories
        categorycombobox.getItems().addAll("Men's Wear", "Women's Wear", "Kid's Wear", "Jewellary");

        // Initialize Table Columns with PropertyValueFactory
        productnamecolumn.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        productidcolumn.setCellValueFactory(new PropertyValueFactory<>("ProductId"));
        categorycolumn.setCellValueFactory(new PropertyValueFactory<>("Category"));
        suppliernamecolumn.setCellValueFactory(new PropertyValueFactory<>("SupplierName"));
        initialquantitystockcolumn.setCellValueFactory(new PropertyValueFactory<>("InitialStockQuantity"));
        unitpricecolumn.setCellValueFactory(new PropertyValueFactory<>("UnitPrice"));
        reorderlevelcolumn.setCellValueFactory(new PropertyValueFactory<>("ReorderLevel"));

        // Set data to TableView
        addnewproducttableview.setItems(AddNewProductList);
    }

    // Add Button: Adds a product to the table
    @FXML
    void addproductbtn(ActionEvent event) {
        String productName = productnametextfield.getText().trim();
        String productId = productidtextfield.getText().trim();
        String category = categorycombobox.getValue();
        String supplierName = suppliernametextfield.getText().trim();
        String initialStockQuantity = initialstockquantitytextfield.getText().trim();
        String unitPrice = unitpricetextfield.getText().trim();
        String reorderLevel = reorderleveltextfield.getText().trim();

        // Validate inputs
        if (productName.isEmpty() || productId.isEmpty() || category == null || supplierName.isEmpty() ||
                initialStockQuantity.isEmpty() || unitPrice.isEmpty() || reorderLevel.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled out!");
            return;
        }

        try {
            // Validate numeric fields
            Integer.parseInt(initialStockQuantity);
            Double.parseDouble(unitPrice);
            Integer.parseInt(reorderLevel);

            // Add new product to the list
            AddNewProducts newProduct = new AddNewProducts(
                    productName, productId, category, supplierName, initialStockQuantity, unitPrice, reorderLevel);
            AddNewProductList.add(newProduct);

            // Clear input fields and show success message
            clearInputFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Product added successfully!");

        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Initial Quantity, Unit Price, and Reorder Level must be numeric!");
        }
    }

    // Cancel Button: Clears input fields
    @FXML
    void cancelbtn(ActionEvent event) {
        clearInputFields();
    }

    // Back Button: Navigates to previous scene
    @FXML
    void backbtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard_ManagingDirector.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
    }

    // Utility Method: Clears all input fields
    private void clearInputFields() {
        productnametextfield.clear();
        productidtextfield.clear();
        categorycombobox.setValue(null);
        suppliernametextfield.clear();
        initialstockquantitytextfield.clear();
        unitpricetextfield.clear();
        reorderleveltextfield.clear();
    }

    // Utility Method: Shows alert messages
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
