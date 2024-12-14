package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class QualityReportsControllerView {

    @FXML
    private TableColumn<?, ?> dorcolumnview;

    @FXML
    private DatePicker dordatepicker;

    @FXML
    private CheckBox duarabilitycheckbox;

    @FXML
    private RadioButton failradiobtn;

    @FXML
    private CheckBox functionalitycheckbox;

    @FXML
    private TableColumn<?, ?> inspectionitemscolumnview;

    @FXML
    private CheckBox packagingcheckbox;

    @FXML
    private RadioButton passradiobtn;

    @FXML
    private TableColumn<?, ?> productcategorycolumnview;

    @FXML
    private ComboBox<?> productcombobox;

    @FXML
    private TableView<?> qualityreportstable;

    @FXML
    private TableColumn<?, ?> qualitystatuscolumnview;

    @FXML
    void backbtn(ActionEvent event) {

    }

    @FXML
    void updatequalityreportsbtn(ActionEvent event) {

    }

    @FXML
    void viewqualityreportsbtn(ActionEvent event) {

    }

}
