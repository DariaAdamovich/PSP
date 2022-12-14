package userFXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utils.ClientSocket;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Account implements Initializable {
    private final String blackbutton = "-fx-text-fill: black;\n" +
            "    -fx-font-family: \"Arial Narrow\";\n" +
            "    -fx-font-weight: bold;\n" +
            "   -fx-border-color:black;\n" +
            "   -fx-background-color:null;";
    private final String whitebutton = "-fx-text-fill: white;\n" +
            "    -fx-font-family: \"Arial Narrow\";\n" +
            "    -fx-font-weight: bold;\n" +
            "   -fx-border-color:white;\n" +
            "   -fx-background-color:null;";
    private final String whitefont = "-fx-text-fill:white;";
    private final String blackfont = "-fx-text-fill:black;";

    public static int theme = 0;
    public Button btnExit;
    public Button btnManageAccount;
    public Button btnEmployee;
    public Button btnProducts;
    public Button btnMakeAppointment;
    public Button btnInformation;

    public AnchorPane anchorPane;
    public Label text1;
    public Label text2;
    public Label text3;

    public void Exit_Pressed() throws IOException {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        ClientSocket.getInstance().setUser(null);
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Manage_Account_Pressed() throws IOException {
        Stage stage = (Stage) btnManageAccount.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("manageAccount.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Services_Pressed() throws IOException {
        Stage stage = (Stage) btnProducts.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("Services.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Make_Appointment_Pressed() throws IOException {
        Stage stage = (Stage) btnMakeAppointment.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("AddAppointment.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    public void Get_Information_Pressed() throws IOException {
        Stage stage = (Stage) btnInformation.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("ClientAppointments.fxml"));
        Scene newScene = new Scene(root);
        stage.setScene(newScene);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (theme == 1) {
            anchorPane.setStyle("-fx-background-image: url(images/newbackg.jpg)");
            btnExit.setStyle(blackbutton);
            btnManageAccount.setStyle(blackbutton);
            btnEmployee.setStyle(blackbutton);
            btnProducts.setStyle(blackbutton);
            btnMakeAppointment.setStyle(blackbutton);
            btnInformation.setStyle(blackbutton);
            text1.setStyle(blackfont);
            text2.setStyle(blackfont);
            text3.setStyle(blackfont);
            theme = 0;
        }
    }
}
