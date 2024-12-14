package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DefectsErrorLogControllerView {

    @FXML
    private TextArea correctiveactionstextarea;

    @FXML
    private TableColumn<?, ?> dateoflogscolumnview;

    @FXML
    private DatePicker datereporteddatepicker;

    @FXML
    private TableView<?> defectsanderrorlogtable;

    @FXML
    private TableColumn<?, ?> detailscolumnview;

    @FXML
    private TextField detailstextfield;

    @FXML
    private ComboBox<?> errortypecombobox;

    @FXML
    private TableColumn<?, ?> privacylogscolumnview;

    @FXML
    private TextField productcategorytextfield;

    @FXML
    private TableColumn<?, ?> usercolumnview;

    @FXML
    void backbtn(ActionEvent event) {

    }

    @FXML
    void updaterecordsbtn(ActionEvent event) {

    }

}
