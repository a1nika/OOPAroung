package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ReviewCustomerFeedbackController {

    @FXML
    private TextField customeridtextfield;

    @FXML
    private TextField customernametextfield;

    @FXML
    private TextField datetextfield;

    @FXML
    private TextArea respondtofeedbacktextfield;

    @FXML
    private Label reviewcustomerfeedbacklabel;

    @FXML
    private Text unitpricetextfield;

    @FXML
    private TextArea viewcustomerfeedbacktextfield;

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
    void submitrespondbtn(ActionEvent event) {

    }

}
