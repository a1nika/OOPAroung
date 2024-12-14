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

public class GenerateFinancialReportsController {

    @FXML
    private TableColumn<?, ?> categorycolumn;

    @FXML
    private ComboBox<?> categorycombobox;

    @FXML
    private TableColumn<?, ?> enddatecolumn;

    @FXML
    private TextField enddatetextfield;

    @FXML
    private TableColumn<?, ?> expensecolumn;

    @FXML
    private TextField expensetextfield;

    @FXML
    private TableView<?> financialreporttableview;

    @FXML
    private Label generatefinancialreportlabel;

    @FXML
    private TableColumn<?, ?> profitcolumn;

    @FXML
    private TextField profittextfield;

    @FXML
    private ComboBox<?> reporttypecombobox;

    @FXML
    private TableColumn<?, ?> revenuecolumn;

    @FXML
    private TextField revenuetextfield;

    @FXML
    private TableColumn<?, ?> startdatecolumn;

    @FXML
    private TextField startdatetextfield;

    @FXML
    private TableColumn<?, ?> transactionidcolumn;

    @FXML
    private TextField transactionidtextfield;

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
    void cancelbtn(ActionEvent event) {

    }

    @FXML
    void generatefinancialreportbtn(ActionEvent event) {

    }

    @FXML
    void savereportbtn(ActionEvent event) {

    }

}

