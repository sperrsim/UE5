package at.sperr;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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
        cels_label.setMaxHeight(25);
        cels_label.setStyle("-fx-font-size: 20px;" +
                            "-fx-font-weight: bold;");
        Label fahr_label = new Label("°Fahrenheit");
        fahr_label.setMaxHeight(25);
        fahr_label.setStyle("-fx-font-size: 20px;" +
                            "-fx-font-weight: bold;");

        //Creating Textfields for the Values
        TextField cels_field = new TextField();
        cels_field.setPromptText("Grad Celsius Wert");
        cels_field.setPrefHeight(20);
        cels_field.setMaxWidth(300);
        cels_field.setStyle("-fx-font-size: 15px;");
        TextField fahr_field = new TextField();
        fahr_field.setPromptText("Grad Fahrenheit Wert");
        fahr_field.setPrefHeight(20);
        fahr_field.setMaxWidth(300);
        fahr_field.setStyle("-fx-font-size: 15px;");

        //Implementing the conversion from Celsius to Fahrenheit
        EventHandler<MouseEvent> fahr_cels_conv = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                try {
                    double fahr_value = Double.parseDouble(fahr_field.getText());
                    double cels_value = (fahr_value-32)*5/9;
                    cels_field.setText(String.valueOf(cels_value));
                } catch (Exception e)
                {
                    System.out.println("Fehlerhafter Wert! Versuchen Sie es erneut!");
                }
        //Implementing the Celsius to Fahrenheit Conversion
        EventHandler<MouseEvent> cels_fahr_conv = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                try
                {
                    double cels_value = Double.parseDouble(cels_field.getText());
                    double fahr_value = (cels_value * 9/5) + 32;
                    fahr_field.setText(String.valueOf(fahr_value));
                }catch (Exception e)
                {
                    System.out.println("Fehlerhafter Wert! Versuchen Sie es erneut!");
                }
            }
        };

        //Creating the Buttons for the conversion
        Button cels_fahr = new Button("Celsius -> Fahrenheit");
        cels_fahr.setPrefWidth(300);
        cels_fahr.setMaxHeight(25);
        cels_fahr.setStyle("-fx-font-weight: bold;" +
                            "-fx-font-size: 20px;");
        cels_fahr.addEventHandler(MouseEvent.MOUSE_CLICKED, cels_fahr_conv);
        Button fahr_cels = new Button("Fahrenheit -> Celsius");
        fahr_cels.setPrefWidth(300);
        fahr_cels.setMaxHeight(25);
        fahr_cels.setStyle("-fx-font-weight: bold;" +
                            "-fx-font-size: 20px;");
        fahr_cels.addEventHandler(MouseEvent.MOUSE_CLICKED, fahr_cels_conv);

        //Putting everything together
        converter.getChildren().addAll(cels_label, cels_field, fahr_label, fahr_field, cels_fahr, fahr_cels);

        //Creating the Window
        Scene scene = new Scene(converter, 500,500);
        stage.setTitle("Celsius - Fahrenheit Converter by Sperr");
        stage.setScene(scene);
        stage.show();
    }
}
