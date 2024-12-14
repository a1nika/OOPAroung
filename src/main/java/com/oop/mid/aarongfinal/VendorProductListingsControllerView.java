package com.oop.mid.aarongfinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class VendorProductListingsControllerView {

    @FXML
    private RadioButton excellentradiobtn;

    @FXML
    private RadioButton goodradiobtn;

    @FXML
    private TableColumn<VendorProductListings, String> namecolumnview;

    @FXML
    private TextField nametextfield;

    @FXML
    private RadioButton poorradiobtn;

    @FXML
    private TableColumn<VendorProductListings, String> productcategorycolumnview3;

    @FXML
    private ComboBox<String> productcategorycombobox3;

    @FXML
    private TableColumn<VendorProductListings, String> qualityratingcolumnview;

    @FXML
    private TableColumn<VendorProductListings, String> statuscolumnview3;

    @FXML
    private TextField statustextfield3;

    @FXML
    private TableColumn<VendorProductListings, String> vendorcolumnview;

    @FXML
    private TableView<VendorProductListings> vendorproductlistingstable;

    @FXML
    private TextField vendortextfield;

    private ObservableList<VendorProductListings> vendorProductListings = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Initialize table columns
        namecolumnview.setCellValueFactory(new PropertyValueFactory<>("name"));
        productcategorycolumnview3.setCellValueFactory(new PropertyValueFactory<>("productCategory"));
        qualityratingcolumnview.setCellValueFactory(new PropertyValueFactory<>("qualityRating"));
        statuscolumnview3.setCellValueFactory(new PropertyValueFactory<>("status"));
        vendorcolumnview.setCellValueFactory(new PropertyValueFactory<>("vendor"));

        // Set items to the table
        vendorproductlistingstable.setItems(vendorProductListings);

        // Populate the combo box with sample product categories
        productcategorycombobox3.setItems(FXCollections.observableArrayList("Category A", "Category B", "Category C"));
    }

    @FXML
    void backbtn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("quality-manager-dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }
        // Implement scene switching here if required
    }

    @FXML
    void updatelistingbtn(ActionEvent event) {
        // Get inputs from fields
        String name = nametextfield.getText();
        String productCategory = productcategorycombobox3.getValue();
        String qualityRating = excellentradiobtn.isSelected() ? "Excellent" : goodradiobtn.isSelected() ? "Good" : "Poor";
        String status = statustextfield3.getText();
        String vendor = vendortextfield.getText();

        // Add a new listing to the table
        if (!name.isEmpty() && productCategory != null && !status.isEmpty() && !vendor.isEmpty()) {
            VendorProductListings newListing = new VendorProductListings(name, productCategory, qualityRating, status, vendor);
            vendorProductListings.add(newListing);

            // Clear input fields
            nametextfield.clear();
            productcategorycombobox3.setValue(null);
            statustextfield3.clear();
            vendortextfield.clear();
            excellentradiobtn.setSelected(false);
            goodradiobtn.setSelected(false);
            poorradiobtn.setSelected(false);
        }
    }

    @FXML
    void flaglistingbtn(ActionEvent event) {
        // Remove selected item from the table
        VendorProductListings selectedListing = vendorproductlistingstable.getSelectionModel().getSelectedItem();
        if (selectedListing != null) {
            vendorProductListings.remove(selectedListing);
        } else {
            // Optionally, show an alert if no item is selected
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select a listing to remove.");
            alert.showAndWait();
        }
    }
}