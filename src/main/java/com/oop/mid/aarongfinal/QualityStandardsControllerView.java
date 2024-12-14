package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class QualityStandardsControllerView {

    @FXML
    private TableColumn<?, ?> compliancestatuscolumnview;

    @FXML
    private TextField compliancestatustextfield;

    @FXML
    private ComboBox<?> fetchproductiondatacombobox;

    @FXML
    private RadioButton invalidradiobtn;

    @FXML
    private TableColumn<?, ?> metriccolumnview;

    @FXML
    private TextField metrictextfield;

    @FXML
    private TableColumn<?, ?> productiondatacolumnview;

    @FXML
    private TableView<?> qualitystandardstable;

    @FXML
    private TableColumn<?, ?> resultcolumnview;

    @FXML
    private TextField resulttextfield;

    @FXML
    private TableColumn<?, ?> suggestionscolumnview;

    @FXML
    private TextField suggestionstextfield1;

    @FXML
    private RadioButton validradiobtn;

    @FXML
    void backbtn(ActionEvent event) {

    }

    @FXML
    void fetchdatabtn(ActionEvent event) {

    }

    @FXML
    void uploadreportbtn(ActionEvent event) {

    }

}
