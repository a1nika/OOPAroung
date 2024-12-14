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

public class employee_managementController {

    @FXML
    private TableColumn<Employee, String> absenttablecolumn;

    @FXML
    private TextField absenttextfield;

    @FXML
    private TableColumn<Employee, String> attendtablecolumn;

    @FXML
    private TextField attendtextfield;

    @FXML
    private ComboBox<String> departmentcombobox;

    @FXML
    private TableColumn<Employee, String> departmentteblecolumn;

    @FXML
    private TableView<Employee> employeetableview;

    @FXML
    private TableColumn<Employee, String> idtablecolumn;

    @FXML
    private TextField idtextfield;

    @FXML
    private TableColumn<Employee, String> nametablecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private TableColumn<Employee, String> notetablecolumn;

    @FXML
    private TextField notetextfield;

    @FXML
    private TableColumn<Employee, String> presenttablecolumn;

    @FXML
    private TextField presenttextfield;

    @FXML
    private TableColumn<Employee, String> projecttablecolumn;

    @FXML
    private TextField projecttextfield;

    @FXML
    private ComboBox<String> ratingcombobox;

    @FXML
    private TableColumn<Employee, String> ratingtablecolumn;

    @FXML
    private TableColumn<Employee, String> selftablecolumn;

    @FXML
    private TextField selftextfield;

    @FXML
    private TableColumn<Employee, String> skilltablecolumn;

    @FXML
    private TextField skilltextfield;

    private final ObservableList<Employee> employeeList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBoxes
        departmentcombobox.setItems(FXCollections.observableArrayList("HR", "Finance", "IT", "Sales", "Operations"));
        ratingcombobox.setItems(FXCollections.observableArrayList("Excellent", "Good", "Average", "Below Average"));

        // Set up TableView columns
        idtablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getId()));
        nametablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        departmentteblecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDepartment()));
        skilltablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getSkill()));
        presenttablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(String.valueOf(cellData.getValue().getPresentDays())));
        absenttablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(String.valueOf(cellData.getValue().getAbsentDays())));
        projecttablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getProject()));
        selftablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getSelfEvaluation()));
        ratingtablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getRating()));
        notetablecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getNotes()));

        employeetableview.setItems(employeeList);
    }

    @FXML
    void addbtn(ActionEvent event) {
        String id = idtextfield.getText().trim();
        String name = nametextfield.getText().trim();
        String department = departmentcombobox.getValue();
        String skill = skilltextfield.getText().trim();
        String presentText = presenttextfield.getText().trim();
        String absentText = absenttextfield.getText().trim();
        String project = projecttextfield.getText().trim();
        String selfEvaluation = selftextfield.getText().trim();
        String rating = ratingcombobox.getValue();
        String notes = notetextfield.getText().trim();

        if (id.isEmpty() || name.isEmpty() || department == null || skill.isEmpty() || presentText.isEmpty()
                || absentText.isEmpty() || project.isEmpty() || selfEvaluation.isEmpty() || rating == null || notes.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields must be filled!");
            return;
        }

        try {
            int presentDays = Integer.parseInt(presentText);
            int absentDays = Integer.parseInt(absentText);

            Employee employee = new Employee(id, name, department, skill, presentDays, absentDays, project, selfEvaluation, rating, notes);
            employeeList.add(employee);

            clearFields();
            showAlert(Alert.AlertType.INFORMATION, "Success", "Employee added successfully!");
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Present and Absent days must be valid integers!");
        }
    }

    private void clearFields() {
        idtextfield.clear();
        nametextfield.clear();
        departmentcombobox.setValue(null);
        skilltextfield.clear();
        presenttextfield.clear();
        absenttextfield.clear();
        projecttextfield.clear();
        selftextfield.clear();
        ratingcombobox.setValue(null);
        notetextfield.clear();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

@FXML
    void backbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("head_of_retail_dashb.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void logoutbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

}

