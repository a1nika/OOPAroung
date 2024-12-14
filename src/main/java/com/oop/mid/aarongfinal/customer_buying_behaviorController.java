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
import javafx.stage.Stage;

public class customer_buying_behaviorController {

    @FXML
    private TableColumn<CustomerBehavior, String> amounttableview;

    @FXML
    private TextField amounttextfield;

    @FXML
    private ComboBox<String> catagorycombobox;

    @FXML
    private TableColumn<CustomerBehavior, String> categorytableview;

    @FXML
    private TableView<CustomerBehavior> customerstableview;

    @FXML
    private DatePicker dob;

    @FXML
    private TableColumn<CustomerBehavior, String> dobtableview;

    @FXML
    private RadioButton femaleradiobtn;

    @FXML
    private TableColumn<CustomerBehavior, String> gendertableview;

    @FXML
    private TableColumn<CustomerBehavior, String> idtableview;

    @FXML
    private TextField idtextfeild;

    @FXML
    private RadioButton maleradiobtn;

    @FXML
    private TableColumn<CustomerBehavior, String> nametableview;

    @FXML
    private TextField nametextfield;

    @FXML
    private TableColumn<CustomerBehavior, String> producttableview;

    @FXML
    private TextField producttextfield;

    private final ObservableList<CustomerBehavior> customerList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBox with categories
        catagorycombobox.setItems(FXCollections.observableArrayList("Electronics", "Clothing", "Food", "Accessories"));

        // Set up TableView columns
        idtableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getId()));
        nametableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        gendertableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getGender()));
        dobtableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDob()));
        categorytableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCategory()));
        producttableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getProduct()));
        amounttableview.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(String.valueOf(cellData.getValue().getAmount())));

        customerstableview.setItems(customerList);
    }

    @FXML
    void addbtn(ActionEvent event) {
        String id = idtextfeild.getText().trim();
        String name = nametextfield.getText().trim();
        String gender = maleradiobtn.isSelected() ? "Male" : femaleradiobtn.isSelected() ? "Female" : null;
        String dateOfBirth = (dob.getValue() != null) ? dob.getValue().toString() : null;
        String category = catagorycombobox.getValue();
        String product = producttextfield.getText().trim();
        String amountText = amounttextfield.getText().trim();

        if (id.isEmpty() || name.isEmpty() || gender == null || dateOfBirth == null || category == null || product.isEmpty() || amountText.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled!");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            CustomerBehavior customer = new CustomerBehavior(id, name, gender, dateOfBirth, category, product, amount);
            customerList.add(customer);

            clearFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Customer data added successfully!");
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Amount must be a valid number!");
        }
    }

    @FXML
    void backbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("head_of_retail_dashb.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();
        // Logic for navigating back
    }

    @FXML
    void filterbtn(ActionEvent event) {
        // Logic for filtering table entries
    }

    @FXML
    void logoutbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

        // Logic for logging out
    }

    @FXML
    void removebtn(ActionEvent event) {
        CustomerBehavior selectedCustomer = customerstableview.getSelectionModel().getSelectedItem();
        if (selectedCustomer != null) {
            customerList.remove(selectedCustomer);
            showAlert(Alert.AlertType.INFORMATION, "Success", "Customer data removed successfully!");
        } else {
            showAlert(Alert.AlertType.WARNING, "Selection Error", "Please select a customer to remove.");
        }
    }

    private void clearFields() {
        idtextfeild.clear();
        nametextfield.clear();
        maleradiobtn.setSelected(false);
        femaleradiobtn.setSelected(false);
        dob.setValue(null);
        catagorycombobox.setValue(null);
        producttextfield.clear();
        amounttextfield.clear();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}


