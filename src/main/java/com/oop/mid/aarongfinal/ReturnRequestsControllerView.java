package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ReturnRequestsControllerView {

    @FXML
    private TextField CGPAtextfield;

    @FXML
    private TableColumn<?, ?> customernamecolumnview;

    @FXML
    private TextField customernametextfield;

    @FXML
    private DatePicker datepicker1;

    @FXML
    private TableColumn<?, ?> datepicker1columnview;

    @FXML
    private CheckBox invalidcheckbox;

    @FXML
    private TableColumn<?, ?> productcolumnview1;

    @FXML
    private AnchorPane producttextfield1;

    @FXML
    private TableColumn<?, ?> reasonforreturncolumnview;

    @FXML
    private TextField reasonforreturntextfield;

    @FXML
    private TableColumn<?, ?> requestidcolumnview;

    @FXML
    private TextField requestidtextfield;

    @FXML
    private TableView<?> returnrequeststable;

    @FXML
    private TextArea sendmessagetextarea;

    @FXML
    private CheckBox validcheckbox;

    @FXML
    void backbtn(ActionEvent event) {

    }

    @FXML
    void sendmessagebtn(ActionEvent event) {

    }

    @FXML
    void uploadreportbtn(ActionEvent event) {

    }

}
