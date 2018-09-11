package WeatherJavaFX.view;

import WeatherJavaFX.Main;
import WeatherJavaFX.controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class View {

    private VBox vBox;
    private Stage stage;

    public View(Stage stage) {
        this.stage = stage;

    }

    public void loadView() {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(Main.class.getResource("/view.fxml"));
        try {
            vBox = (VBox) loader.load();
            Scene scene = new Scene(vBox);

            stage.setScene(scene);
            stage.show();


            Controller controller = loader.getController();
           controller.setView(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
