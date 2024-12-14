package com.oop.mid;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EmployeeDashboardSceneController {

    @FXML
    private Button additionalResourcesButton;

    @FXML
    private Button applyForPromotionButton;

    @FXML
    private Button leaveOfAbsenceButton;

    @FXML
    private Button myProfileButton;

    @FXML
    private Button remoteWorkButton;

    @FXML
    private Button workScheduleButton;

    @FXML
    void loadAdditionalResourcesOnClick(ActionEvent event) {

    }

    @FXML
    void loadApplyForPromotionOnClick(ActionEvent event) {

    }

    @FXML
    void loadLeaveOfAbsenceOnClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EmployeeLeaveOfAbsenceScene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Dummy Scene");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception ignored){
        }

    }

    @FXML
    void loadMyProfileOnclick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EmployeeMyProfileScene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Dummy Scene");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception ignored){
        }

    }

    @FXML
    void loadRemoteWorkOnClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EmployeeRemoteWork.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Dummy Scene");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception ignored){
        }

    }

    @FXML
    void loadWorkScheduleOnClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EmployeeWorkScheduleScene.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Dummy Scene");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception ignored){
        }



    }

}
