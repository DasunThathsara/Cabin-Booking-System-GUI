package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void UI1btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI2btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI3btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI4btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("4.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI5btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("5.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI6btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("6.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI7btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("7.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI8btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("8.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void UI9btn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("9.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
