package com.oop.mid.aarongfinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeWorkScheduleSceneController {

    @FXML
    private TextField EmployeeDepartmentTextField;

    @FXML
    private TableColumn<workSchedule, String> assignmentTableView;

    @FXML
    private TableColumn<workSchedule, String> dateTableView;

    @FXML
    private TextField employeeIDTextField;

    @FXML
    private TextField employeeNameTextField;

    @FXML
    private TableView<workSchedule> workScheduleTableView;

    @FXML
    public void initialize() {

        dateTableView.setCellValueFactory(new PropertyValueFactory<>("date"));
        assignmentTableView.setCellValueFactory(new PropertyValueFactory<>("assignment"));


        ObservableList<workSchedule> workScheduleData = FXCollections.observableArrayList(
                new workSchedule("20 December", "Client Meeting"),
                new workSchedule("21 December", "Project Meeting"),
                new workSchedule("22 December", "Client Meeting"),
                new workSchedule("23 December", "Project Submission")
        );
        workScheduleTableView.setItems(workScheduleData);
    }

    public static class workSchedule {
        private String date;
        private String assignment;

        // Constructor
        public workSchedule(String date, String assignment) {
            this.date = date;
            this.assignment = assignment;
        }

        // Getters for the properties
        public String getDate() {
            return date;
        }

        public String getAssignment() {
            return assignment;
        }
    }
}



