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

public class DailySalesControllerView {

    @FXML
    private TableView<DailySales> dailysalestable;

    @FXML
    private TableColumn<DailySales, String> datecolumnview;

    @FXML
    private DatePicker datepicker;

    @FXML
    private ComboBox<String> majorstorelocationcomboboxcombobox;

    @FXML
    private TableColumn<DailySales, String> productnamecolumnview;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableColumn<DailySales, String> storelocationcolumnview;

    @FXML
    private TableColumn<DailySales, Integer> totalunitssoldcolumnview;

    @FXML
    private TextField totalunitssoldtextfield;

    @FXML
    private TableColumn<DailySales, Integer> unitssoldcolumnview;

    @FXML
    private TextField unitssoldtextfield;

    private ObservableList<DailySales> dailySalesList = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Set up table columns
        datecolumnview.setCellValueFactory(new PropertyValueFactory<>("date"));
        productnamecolumnview.setCellValueFactory(new PropertyValueFactory<>("productName"));
        storelocationcolumnview.setCellValueFactory(new PropertyValueFactory<>("storeLocation"));
        totalunitssoldcolumnview.setCellValueFactory(new PropertyValueFactory<>("totalUnitsSold"));
        unitssoldcolumnview.setCellValueFactory(new PropertyValueFactory<>("unitsSold"));

        // Set the table's items
        dailysalestable.setItems(dailySalesList);

        // Add dummy data to the ComboBox
        majorstorelocationcomboboxcombobox.setItems(FXCollections.observableArrayList("Store A", "Store B", "Store C"));
    }

    @FXML
    void backbtn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("accounts_manager_dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }
        // Scene switching code here (refer to the previous example)
    }

    @FXML
    void updatesalesrecordbtn(ActionEvent event) {
        // Get values from inputs
        String date = datepicker.getValue() != null ? datepicker.getValue().toString() : "";
        String productName = productnametextfield.getText();
        String storeLocation = majorstorelocationcomboboxcombobox.getValue();
        int totalUnitsSold = totalunitssoldtextfield.getText().isEmpty() ? 0 : Integer.parseInt(totalunitssoldtextfield.getText());
        int unitsSold = unitssoldtextfield.getText().isEmpty() ? 0 : Integer.parseInt(unitssoldtextfield.getText());

        // Add a new DailySale to the list
        if (!date.isEmpty() && !productName.isEmpty() && storeLocation != null) {
            DailySales newSale = new DailySales(date, productName, storeLocation, totalUnitsSold, unitsSold);
            dailySalesList.add(newSale);

            // Clear inputs
            datepicker.setValue(null);
            productnametextfield.clear();
            majorstorelocationcomboboxcombobox.setValue(null);
            totalunitssoldtextfield.clear();
            unitssoldtextfield.clear();
        }
    }
}