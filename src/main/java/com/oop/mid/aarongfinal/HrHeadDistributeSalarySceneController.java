package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HrHeadDistributeSalarySceneController {

    @FXML
    private TextField AmountTextField;

    @FXML
    private TextField employeeIDTextField;

    @FXML
    private TextField employeeNAmeTextField;

    @FXML
    private TextField monthTextField;

    @FXML
    private Button salarySubmitButton;

    @FXML
    void SubmitsalaryOnClick(ActionEvent event) {

        String name = employeeNAmeTextField.getText();
        String id = employeeIDTextField.getText();
        String month = monthTextField.getText();
        String amount = AmountTextField.getText();


        if (name.isEmpty() || id.isEmpty() || month.isEmpty() || amount.isEmpty()){
            showAlert(Alert.AlertType.ERROR, "Error!", "Please fill all the fields.");
            return;
        }

        Employee employee = new Employee(name, id, month, amount);
        System.out.println("Information Updated: " + employee);
        showAlert(Alert.AlertType.INFORMATION, "Update Successful!", "Information has been updated successfully.");;
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }

    private static class Employee {
        public Employee(String name, String id, String month, String amount) {
        }
}}
