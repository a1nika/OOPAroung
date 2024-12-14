package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class customer_experience_improvementController {

    @FXML
    private TableColumn<?, ?> channeltableview;

    @FXML
    private ComboBox<?> channeltextfield;

    @FXML
    private TableView<?> customerexperienceimprovementshowtable;

    @FXML
    private DatePicker dob1;

    @FXML
    private TableColumn<?, ?> dob1tableview;

    @FXML
    private DatePicker dob2;

    @FXML
    private TableColumn<?, ?> dob2tableview;

    @FXML
    private TableColumn<?, ?> feedbacktableview;

    @FXML
    private TextField feedbacktextfield;

    @FXML
    private TableColumn<?, ?> issuetableview;

    @FXML
    private TextField issuetextfield;

    @FXML
    private TableColumn<?, ?> nametableview;

    @FXML
    private TextField nametextfield;

    @FXML
    private RadioButton noradiobutton;

    @FXML
    private ComboBox<?> ratingcombobox;

    @FXML
    private TableColumn<?, ?> ratngtableview;

    @FXML
    private TableColumn<?, ?> requiretableviw;

    @FXML
    private ComboBox<?> satuscombobox;

    @FXML
    private TableColumn<?, ?> statustableview;

    @FXML
    private TextField suggestiontextfield;

    @FXML
    private TableColumn<?, ?> suggesttableview;

    @FXML
    private RadioButton yesradiobutton;

    @FXML
    void addbtn(ActionEvent event) {

    }

    @FXML
    void logoutbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void returnbtn(ActionEvent event) throws com.oop.mid.aarongfinal.IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("head_of_retail_dashb.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

}

