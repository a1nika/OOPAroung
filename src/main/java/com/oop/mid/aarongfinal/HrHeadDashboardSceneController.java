package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HrHeadDashboardSceneController {

    @FXML
    private Button aLeaveOFAbsenceButton;

    @FXML
    private Button approveRemoteWorkButton;

    @FXML
    private Button arrangeTrainingButton;

    @FXML
    private Button distributeSalaryButton;

    @FXML
    private Button perfomenceAnnalysisButton;

    @FXML
    private Button recruitMemberButton;

    @FXML
    private Button updateEmployeeRecordButton;

    @FXML
    private Button workflowPlanningButton;

    @FXML
    void LoadDistributeSalaryOnClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HrHeadDistributeSalaryScene.fxml"));
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
    void loadALeaveOFAbsenceOnClick(ActionEvent event) {

    }

    @FXML
    void loadApproveRemoteworkOnClick(ActionEvent event) {

    }

    @FXML
    void loadArrangeTrainingOnClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HrHeadDistributeSalaryScene.fxml"));
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
    void loadEmployeeRecordOnClick(ActionEvent event) {

    }

    @FXML
    void loadPerfomenceAnnalysisOnClick(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HrHeadPerfomenceAnnalysisScene.fxml"));
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
    void loadRecruitMemberOnClick(ActionEvent event) {

    }

    @FXML
    void loadWorkflowPlaiingOnClick(ActionEvent event) {

    }

}
