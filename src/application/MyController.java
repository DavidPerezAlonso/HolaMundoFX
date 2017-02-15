package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {

	@FXML
   private Button myButton;

   @FXML
   private TextField myTextField;

   @FXML
   public void initialize() {

       // TODO (don't really need to do anything here).

   }

   // When user click on myButton
   // this method will be called.
   public void showDateTime(ActionEvent event) {
       System.out.println("Button Clicked!");

       Date now= new Date();

       DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");


        // Model Data
        String dateTimeString = df.format(now);

        // Show in VIEW
        myTextField.setText(dateTimeString);

   }

}
