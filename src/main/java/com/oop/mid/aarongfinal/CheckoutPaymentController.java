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

public class CheckoutPaymentController {

    @FXML
    private TextArea addresstextfield;

    @FXML
    private Label checkoutandpaymentlabel;

    @FXML
    private TableColumn<CheckoutPayment, String> contactnocolumn;

    @FXML
    private TextField contactnotextfield;

    @FXML
    private TableColumn<CheckoutPayment, String> customernamecolumn;

    @FXML
    private TextField customernametextfield;

    @FXML
    private TextField emailtextfield;

    @FXML
    private TableColumn<CheckoutPayment, String> paymentmethodcolumn;

    @FXML
    private ComboBox<String> paymentmethodcombobox;

    @FXML
    private TableView<CheckoutPayment> productdetailstableview;

    @FXML
    private TableColumn<CheckoutPayment, String> productpricecolumn;

    @FXML
    private TextField productpricetextfield;

    @FXML
    private TableColumn<CheckoutPayment, Double> totalamountcolumn;

    @FXML
    private TextField totalamounttextfield;

    // Observable list to store the products added to the checkout
    private final ObservableList<CheckoutPayment> checkoutList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Populate payment method ComboBox
        paymentmethodcombobox.getItems().addAll("Credit Card", "Debit Card", "Cash on Delivery", "Mobile Banking");

        // Set up TableView columns
        contactnocolumn.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
        customernamecolumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        paymentmethodcolumn.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
        productpricecolumn.setCellValueFactory(new PropertyValueFactory<>("productPrice"));
        totalamountcolumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));

        // Bind the list to the table
        productdetailstableview.setItems(checkoutList);
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

    @FXML
    void cancelpaymentbtn(ActionEvent event) {
        // Clear all fields and reset the table
        showAlert(Alert.AlertType.INFORMATION, "Payment Cancelled", "The payment has been cancelled.");
        clearInputFields();
    }

    @FXML
    void makepaymentbtn(ActionEvent event) {
        String customerName = customernametextfield.getText().trim();
        String contactNo = contactnotextfield.getText().trim();
        String email = emailtextfield.getText().trim();
        String address = addresstextfield.getText().trim();
        String paymentMethod = paymentmethodcombobox.getValue();

        if (customerName.isEmpty() || contactNo.isEmpty() || email.isEmpty() || address.isEmpty() || paymentMethod == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled out to proceed with payment!");
            return;
        }

        double totalAmount = calculateTotalAmount();

        showAlert(Alert.AlertType.INFORMATION, "Payment Successful",
                "Payment made successfully!\n" +
                        "Customer Name: " + customerName + "\n" +
                        "Contact No: " + contactNo + "\n" +
                        "Payment Method: " + paymentMethod + "\n" +
                        "Total Amount: $" + String.format("%.2f", totalAmount));

        // Clear input fields after successful payment
        clearInputFields();
    }

    private double calculateTotalAmount() {
        double total = 0.0;
        for (CheckoutPayment item : checkoutList) {
            total += item.getTotalAmount();
        }
        totalamounttextfield.setText(String.format("%.2f", total));
        return total;
    }

    private void clearInputFields() {
        customernametextfield.clear();
        contactnotextfield.clear();
        emailtextfield.clear();
        addresstextfield.clear();
        paymentmethodcombobox.setValue(null);
        totalamounttextfield.clear();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
