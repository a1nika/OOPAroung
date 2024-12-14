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

public class SalesReportController {

    @FXML
    private ComboBox<?> categorycombobox;

    @FXML
    private TextField enddatetextfield;

    @FXML
    private TableView<?> productdetailstableview;

    @FXML
    private TableColumn<?, ?> productidcolumn;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TextField productpricetextfield;

    @FXML
    private ComboBox<?> reporttypecombobox;

    @FXML
    private Label salesreportlabel;

    @FXML
    private TextField startdatetextfield;

    @FXML
    private TableColumn<?, ?> totalprofitcolumn;

    @FXML
    private TextField totalprofittextfield;

    @FXML
    private TableColumn<?, ?> totalrevenuecolumn;

    @FXML
    private TextField totalrevenuetextfield;

    @FXML
    private TableColumn<?, ?> totalunitscolumn;

    @FXML
    private TextField totalunitstextfield;

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
    void generatereportbtn(ActionEvent event) {

    }

}

