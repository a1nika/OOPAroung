package com.oop.mid.aarongfinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class BudgetDataControllerView {

    @FXML
    private TableColumn<BudgetData, Double> allocatedamountcolumnview;

    @FXML
    private TextField allocatedamounttextfield;

    @FXML
    private TableColumn<BudgetData, String> budgetcategorycolumnview;

    @FXML
    private ComboBox<String> budgetcategorycombobox;

    @FXML
    private TableView<BudgetData> budgetdatatable;

    @FXML
    private RadioButton noradiobtn;

    @FXML
    private TableColumn<BudgetData, Boolean> overbudgetstatuscolumnview;

    @FXML
    private TableColumn<BudgetData, Double> remainigamountcolumnview;

    @FXML
    private TextField remainingamounttextfield;

    @FXML
    private TableColumn<BudgetData, Double> usedamountcolumnview;

    @FXML
    private TextField usedamounttextfield;

    @FXML
    private RadioButton yesradiobtn;

    private ObservableList<BudgetData> budgetDataList;

    @FXML
    void backbtn(ActionEvent event) {
        // Handle back button (close the current window or navigate to a previous screen)
        System.out.println("Back button clicked");
    }

    @FXML
    void loadbudgedatatbtn(ActionEvent event) {
        // Load budget data into the table
        try {
            double allocatedAmount = Double.parseDouble(allocatedamounttextfield.getText());
            double usedAmount = Double.parseDouble(usedamounttextfield.getText());
            double remainingAmount = Double.parseDouble(remainingamounttextfield.getText());
            String budgetCategory = budgetcategorycombobox.getValue();
            boolean isOverBudget = yesradiobtn.isSelected();

            // Create a new BudgetData object
            BudgetData data = new BudgetData(allocatedAmount, usedAmount, remainingAmount, budgetCategory, isOverBudget);

            // Add data to the TableView
            budgetDataList.add(data);

            // Clear the input fields
            clearInputFields();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }

    @FXML
    public void initialize() {
        // Initialize the TableView and ComboBox
        budgetDataList = FXCollections.observableArrayList();

        allocatedamountcolumnview.setCellValueFactory(new PropertyValueFactory<>("allocatedAmount"));
        usedamountcolumnview.setCellValueFactory(new PropertyValueFactory<>("usedAmount"));
        remainigamountcolumnview.setCellValueFactory(new PropertyValueFactory<>("remainingAmount"));
        budgetcategorycolumnview.setCellValueFactory(new PropertyValueFactory<>("budgetCategory"));
        overbudgetstatuscolumnview.setCellValueFactory(new PropertyValueFactory<>("overBudget"));

        budgetdatatable.setItems(budgetDataList);

        budgetcategorycombobox.setItems(FXCollections.observableArrayList("Category A", "Category B", "Category C"));

        ToggleGroup overBudgetToggleGroup = new ToggleGroup();
        yesradiobtn.setToggleGroup(overBudgetToggleGroup);
        noradiobtn.setToggleGroup(overBudgetToggleGroup);
    }

    private void clearInputFields() {
        allocatedamounttextfield.clear();
        usedamounttextfield.clear();
        remainingamounttextfield.clear();
        budgetcategorycombobox.getSelectionModel().clearSelection();
        yesradiobtn.setSelected(false);
        noradiobtn.setSelected(false);
    }

    // Define the BudgetData class for TableView data
    public static class BudgetData {
        private final double allocatedAmount;
        private final double usedAmount;
        private final double remainingAmount;
        private final String budgetCategory;
        private final boolean overBudget;

        public BudgetData(double allocatedAmount, double usedAmount, double remainingAmount, String budgetCategory, boolean overBudget) {
            this.allocatedAmount = allocatedAmount;
            this.usedAmount = usedAmount;
            this.remainingAmount = remainingAmount;
            this.budgetCategory = budgetCategory;
            this.overBudget = overBudget;
        }

        public double getAllocatedAmount() {
            return allocatedAmount;
        }

        public double getUsedAmount() {
            return usedAmount;
        }

        public double getRemainingAmount() {
            return remainingAmount;
        }

        public String getBudgetCategory() {
            return budgetCategory;
        }

        public boolean isOverBudget() {
            return overBudget;
        }
    }
}