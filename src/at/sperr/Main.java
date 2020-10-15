package at.sperr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Simon Sperr
 * @version 2020.1.1, 15.10.2020
 **/
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox converter = new VBox();

        //Creating Labels for the Values
        Label cels_label = new Label("°Celsius");
        Label fahr_label = new Label("°Fahrenheit");

        //Creating Textfields for the Values
        TextField cels_field = new TextField();
        TextField fahr_field = new TextField();

        //Creating the Buttons for the conversion
        Button cels_fahr = new Button("Celsius -> Fahrenheit");
        Button fahr_cels = new Button("Fahrenheit -> Celsius");


        //Creating the Window
        Scene scene = new Scene(converter, 500,500);
        stage.setTitle("Celsius - Fahrenheit Converter by Sperr");
        stage.setScene(scene);
        stage.show();
    }
}
