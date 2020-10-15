package at.sperr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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

        Scene scene = new Scene(converter, 500,500);
        stage.setTitle("Celsius - Fahrenheit Converter by Sperr");
        stage.setScene(scene);
        stage.show();
    }
}
