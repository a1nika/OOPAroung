package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DataPrivacyReportsControllerView {

    @FXML
    private TextArea correctiveactionstextarea;

    @FXML
    private TableView<?> dataprivacyreportstable;

    @FXML
    private TableColumn<?, ?> detailscolumnview;

    @FXML
    private TextField detailstextfield;

    @FXML
    private TableColumn<?, ?> dolcolumnview;

    @FXML
    private DatePicker doldatepicker;

    @FXML
    private TableColumn<?, ?> privacylogscolumnview;

    @FXML
    private ComboBox<?> privacylogsfilterscombobox;

    @FXML
    private TableColumn<?, ?> usercolumnview;

    @FXML
    private TextField usertextfield;

    @FXML
    void add3btn(ActionEvent event) {

    }

    @FXML
    void backbtn(ActionEvent event) {

    }

}
