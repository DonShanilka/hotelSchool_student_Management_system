package lk.ijse.controller;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.io.IOException;

public class DashBordController {

    @FXML
    private ImageView course;

    @FXML
    private Label lbldesc;

    @FXML
    private Label lblmenu;

    @FXML
    private AnchorPane root;

    @FXML
    private ImageView settings;

    @FXML
    private ImageView student;

    @FXML
    private ImageView transaction;

    @FXML
    void logoutOnAction(MouseEvent event) {

    }

    @FXML
    void navigate(MouseEvent event) throws IOException {
        if (event.getSource() instanceof ImageView) {
            ImageView icon = (ImageView) event.getSource();

            Parent root = null;

            switch (icon.getId()) {
                case "student":
                    root = FXMLLoader.load(getClass().getResource("/view/student.fxml"));
                    break;
                case "course":
                    root = FXMLLoader.load(getClass().getResource("/view/course.fxml"));
                    break;
                case "transaction":
                    root = FXMLLoader.load(getClass().getResource("/view/transaction.fxml"));
                    break;
                case "settings":
                    root = FXMLLoader.load(getClass().getResource("/view/settings.fxml"));
                    break;
            }
            if (root != null) {
                Scene subScene = new Scene(root);
                Stage primaryStage = (Stage) this.root.getScene().getWindow();
                primaryStage.setScene(subScene);
                primaryStage.centerOnScreen();

                TranslateTransition tt = new TranslateTransition(Duration.millis(350), subScene.getRoot());
                tt.setFromX(-subScene.getWidth());
                tt.setToX(0);
                tt.play();
            }

        }
    }

    @FXML
    void playMouseEnterAnimation(MouseEvent event) {

    }

    @FXML
    void playMouseExitAnimation(MouseEvent event) {

    }
}
