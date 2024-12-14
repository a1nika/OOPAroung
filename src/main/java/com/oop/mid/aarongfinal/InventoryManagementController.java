package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryManagementController {

    @FXML
    private TableColumn<?, ?> categorycolumn;

    @FXML
    private ComboBox<?> categorycombobox;

    @FXML
    private Label inventorymanagementlabel;

    @FXML
    private TableView<?> inventorytableview;

    @FXML
    private TableColumn<?, ?> productidcolumn;

    @FXML
    private TextField productidtextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableColumn<?, ?> reorderlevelcolumn;

    @FXML
    private TextField reorderleveltextfield;

    @FXML
    private TableColumn<?, ?> stockquantitycolumn;

    @FXML
    private TextField stockquantitytextfield;

    @FXML
    private ComboBox<?> stockstatuscombobox;

    @FXML
    private TableColumn<?, ?> suppliernamecolumn;

    @FXML
    private TextField suppliernametextfield;

    @FXML
    void addnewproductbtn(ActionEvent event) {

    }

    @FXML
    void backbtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard_ManagingDirector.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void deleteproductbtn(ActionEvent event) {

    }

    @FXML
    void exportinventorydatabtn(ActionEvent event) {

    }

    @FXML
    void updatestockbtn(ActionEvent event) {

    }

}

