package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EmployeeMyProfileSceneController {

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField ageTextField;

    @FXML
    private Button backButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Button saveButton;

    @FXML
    void backToDashboardOnClick(ActionEvent event) {

    }

    @FXML
    void saveOnClick(ActionEvent event) {

        String name = nameTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String address = addressTextField.getText();
        String age = ageTextField.getText();

        if (name.isEmpty() || phoneNumber.isEmpty() || age.isEmpty() || address.isEmpty()){
            showAlert(Alert.AlertType.ERROR, "Error!", "Please fill all the fields.");
            return;
        }

        Employee employee = new Employee(name, age, phoneNumber, address);
        System.out.println("Information Updated: " + employee);
        showAlert(Alert.AlertType.INFORMATION, "Update Successful!", "Information has been updated successfully.");
        clearForm();
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }
    private void clearForm() {
        nameTextField.clear();
        phoneNumberTextField.clear();
        addressTextField.clear();
        ageTextField.clear();
    }
    private static class Employee {
        public Employee(String name, String id, String contactNo, String address) {
        }
}}
