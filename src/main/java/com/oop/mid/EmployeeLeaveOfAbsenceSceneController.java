package com.oop.mid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EmployeeLeaveOfAbsenceSceneController {

    @FXML
    private TextField employeeIdTextField;

    @FXML
    private TextField employeeNameTextField;

    @FXML
    private TextField leavestartDateTextFilde;

    @FXML
    private TextField leveEndDateTextField;

    @FXML
    private TextField reasonTextField;

    @FXML
    private Button submitButton;

    @FXML
    void submitOnClick(ActionEvent event) {
        String name = employeeNameTextField.getText();
        String id = employeeIdTextField.getText();
        String startDate = leavestartDateTextFilde.getText();
        String endDate = leveEndDateTextField.getText();
        String reason = reasonTextField.getText();

        if (name.isEmpty() || id.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || reason.isEmpty()){
            showAlert(Alert.AlertType.ERROR, "Error!", "Please fill all the fields.");
            return;
        }

        Employee employee = new Employee(name, id,startDate, endDate, reason);
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
        employeeNameTextField.clear();
        employeeIdTextField.clear();
        leavestartDateTextFilde.clear();
        leveEndDateTextField.clear();
        reasonTextField.clear();
    }


    private static class Employee {
        public Employee(String name, String id, String contactNo, String address, String reason) {
        }

}}
