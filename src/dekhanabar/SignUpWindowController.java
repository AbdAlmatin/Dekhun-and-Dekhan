/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekhanabar;

import com.jfoenix.controls.JFXTextField;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUpWindowController {

    @FXML
    private JFXTextField UsernameId;

    @FXML
    private JFXTextField PasswordId;

    @FXML
    private JFXTextField Thana;

    @FXML
    private JFXTextField DistrictId;

    @FXML
    private JFXTextField EmailId;

    @FXML
    void SingupButtonPressed(ActionEvent event) throws IOException {
        /*
         * creating a new account for new user i.e., storing username and password
         */
        AddUsernameAndPassword(UsernameId.getText(), PasswordId.getText());
        Parent root = FXMLLoader.load(getClass().getResource("LogInWindow.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Welcome(Dekhan)");
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    private BufferedWriter UserData;
    
    private void AddUsernameAndPassword(String Username, String Password) throws FileNotFoundException, IOException{
        UserData = new BufferedWriter(new FileWriter("C:\\Users\\admat\\OneDrive\\Documents\\NetBeansProjects\\DekhanAbar\\UsernameAndPassword.txt", true));
        UserData.newLine();
        UserData.write(Username + " " + Password);
        UserData.close();
    }
    
    

}
