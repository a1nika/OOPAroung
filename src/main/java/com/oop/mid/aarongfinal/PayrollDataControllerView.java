package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PayrollDataControllerView {

    @FXML
    private TableColumn<?, ?> employeeidcolumnview2;

    @FXML
    private TextField employeeidtextfield2;

    @FXML
    private TableColumn<?, ?> emplyeenamecomunview2;

    @FXML
    private TextField emplyeenametextfield2;

    @FXML
    private TableColumn<?, ?> hourlyratecolumnview;

    @FXML
    private TextField hourlyratetextfield;

    @FXML
    private TableColumn<?, ?> hoursworkedcolumnview;

    @FXML
    private TextField hoursworkedtextfield;

    @FXML
    private TableColumn<?, ?> overtimeamountcolumnview;

    @FXML
    private TextField overtimeamounttextfield;

    @FXML
    private TableView<?> payrolldatatable;

    @FXML
    private TableColumn<?, ?> salarypaidcolumnview;

    @FXML
    private TextField salarypaidtextfield;

    @FXML
    void backbtn(ActionEvent event) {

    }

    @FXML
    void loadpayrolldatabtn(ActionEvent event) {

    }

}
