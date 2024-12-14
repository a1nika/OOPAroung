package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EmployeeRemoteWorkController {

    @FXML
    private TextField employeeIdTextField;

    @FXML
    private TextField employeeNameTextField;

    @FXML
    private TextField reasonTextField;

    @FXML
    private TextField remoteWorkstartDateTextFilde;

    @FXML
    private TextField remoteworkEndDateTextField;

    @FXML
    private Button submitButton;

    @FXML
    void submitOnClick(ActionEvent event) {
        String name = employeeNameTextField.getText();
        String id = employeeIdTextField.getText();
        String startDate = remoteWorkstartDateTextFilde.getText();
        String endDate = remoteworkEndDateTextField.getText();
        String reason = reasonTextField.getText();

        if (name.isEmpty() || id.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || reason.isEmpty()){
            showAlert(Alert.AlertType.ERROR, "Error!", "Please fill all the fields.");
            return;
        }

        RemoteWork RemoteWork = new RemoteWork(name, id,startDate, endDate, reason);
        System.out.println("Information Updated: " + RemoteWork);
        showAlert(Alert.AlertType.INFORMATION, "Remote Work Application Successful", "You HAve Applied For Remote Work Successfully.");;

    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }

    private static class RemoteWork {
        public RemoteWork(String name, String id, String startDate, String endDate, String reason) {
        }

    }

}
