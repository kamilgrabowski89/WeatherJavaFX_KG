package WeatherJavaFX.controller;

import WeatherJavaFX.model.AppProperties;
import WeatherJavaFX.model.Weather;
import WeatherJavaFX.view.View;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;

public class Controller {


    @FXML
    private Label temperature;
    @FXML
    private Label text;
    @FXML
    private Label icon;
    @FXML
    private ImageView imageView;
    @FXML
    public TextField temperatureP;
    @FXML
    public TextField textP;


    public Weather weatherFound;

    public TextField writtenCity;


    public void setView(View view) {
        this.view = view;
    }

    public View view;


    private void setWeatherFound(Weather weather) {
        this.weatherFound = weatherFound;
    }


    public void handleShowButton(javafx.event.ActionEvent actionEvent) {
        AppProperties ap = Config.loadProperties();
        WeatherService weatherService = new WeatherService(ap.getUrl(), ap.getKey());
        setWeatherFound(weatherService.getCityWeather(writtenCity.getText()));
        temperature.setText(String.valueOf((weatherFound.getTemperature())));
        text.setText(String.valueOf((weatherFound.getConditionText())));
        Image image = new Image("http://cdn.apixu.com/weather/64x64/day/113.png");
        imageView.setImage(image);

    }


}
