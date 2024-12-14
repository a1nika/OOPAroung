package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class InventoryCostControllerView {

    @FXML
    private TableColumn<?, ?> costchangecolumnview;

    @FXML
    private TextField costchangetextfield;

    @FXML
    private TableColumn<?, ?> currentcostcolumnview;

    @FXML
    private TextField currentcosttextfield;

    @FXML
    private DatePicker datepicker4;

    @FXML
    private TableColumn<?, ?> datepicker4columnview;

    @FXML
    private TableView<?> inventorycosttable;

    @FXML
    private TableColumn<?, ?> productcategorycolumnview2;

    @FXML
    private ComboBox<?> productcategorycombobox2;

    @FXML
    private TableColumn<?, ?> productnamecolumnview3;

    @FXML
    private TextField productnametextfield3;

    @FXML
    private TableColumn<?, ?> storelocationcolumnview3;

    @FXML
    private TextField storelocationtextfield4;

    @FXML
    void backbtn(ActionEvent event) {

    }

    @FXML
    void updatecostreportbtn(ActionEvent event) {

    }

}
