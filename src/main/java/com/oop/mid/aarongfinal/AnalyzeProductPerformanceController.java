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

public class AnalyzeProductPerformanceController {

    @FXML
    private Label analyzeproductperformancelabel;

    @FXML
    private TableView<?> analyzeproductperformancetableview;

    @FXML
    private TableColumn<?, ?> categorycolumn;

    @FXML
    private ComboBox<?> categorycombobox;

    @FXML
    private TextField datetextfield;

    @FXML
    private TableColumn<?, ?> productidcolumn;

    @FXML
    private TextField productidtextfield;

    @FXML
    private TableColumn<?, ?> productnamecolumn;

    @FXML
    private TextField productnametextfield;

    @FXML
    private TableColumn<?, ?> profitmargincolumn;

    @FXML
    private TextField profitmargintextfield;

    @FXML
    private TableColumn<?, ?> revenuecolumn;

    @FXML
    private TextField revenuetextfield;

    @FXML
    private TableColumn<?, ?> unitssoldcolumn;

    @FXML
    private TextField unitssoldtextfield;

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
    void exportdatabtn(ActionEvent event) {

    }

}
