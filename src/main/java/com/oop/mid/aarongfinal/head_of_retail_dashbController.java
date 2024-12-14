package com.oop.mid.aarongfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class head_of_retail_dashbController {

    @FXML
    void behaviorbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("customer_buying_behaivior.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void healtbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("health_&_safety.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();


    }

    @FXML
    void improvementbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("customer_experience_improvement .fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void inventorybtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inventory_management.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void logoutbtn(ActionEvent event) throws IOException, java.io.IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent parent = loader.load();
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene newScene = new Scene(parent);
            currentStage.setScene(newScene);
            currentStage.show();

    }


    @FXML
    void managementbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("employee_management.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void promotionbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("promotions_and_discounts.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void salesbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sales_performance.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

    @FXML
    void visualbtn(ActionEvent event) throws IOException, java.io.IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visual_merchandising .fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene newScene = new Scene(parent);
        currentStage.setScene(newScene);
        currentStage.show();

    }

}
