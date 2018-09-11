package WeatherJavaFX;

import WeatherJavaFX.view.View;
import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {

    private Stage stage;
    private View view;


    public static void main(String[] args) {

        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        view = new View(this.stage);
        view.loadView();
    }

}