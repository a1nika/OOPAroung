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

public class ManagingStorePromotionsController {

    @FXML
    private TableColumn<?, ?> categorycolumn;

    @FXML
    private ComboBox<?> categorycombobox;

    @FXML
    private TableColumn<?, ?> discountcolumn;

    @FXML
    private TextField discounttextfield;

    @FXML
    private TableColumn<?, ?> enddatecolumn;

    @FXML
    private TextField enddatetextfield;

    @FXML
    private Label managingstorepromotionslabel;

    @FXML
    private TableView<?> managingstorepromotionstableview;

    @FXML
    private TableColumn<?, ?> promotionidcolumn;

    @FXML
    private TextField promotionidtextfield;

    @FXML
    private TableColumn<?, ?> promotionnamecolumn;

    @FXML
    private TextField promotionnametextfield;

    @FXML
    private TableColumn<?, ?> startdatecolumn;

    @FXML
    private TextField startdatetextfield;

    @FXML
    private TableColumn<?, ?> statuscolumn;

    @FXML
    private ComboBox<?> statuscombobox;

    @FXML
    void addnewpromotionbtn(ActionEvent event) {

    }

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
    void deletepromotionbtn(ActionEvent event) {

    }

    @FXML
    void exportpromotiondatabtn(ActionEvent event) {

    }

    @FXML
    void updatepromotionbtn(ActionEvent event) {

    }

}
