package WeatherJavaFX.controller;


import WeatherJavaFX.model.Weather;

import org.json.JSONObject;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherService {

    private String finalUrl;

    public WeatherService(String url, String key) {
        finalUrl = url + "?key=" + key;
    }


    public Weather getCityWeather(String city) {

        Weather weather = new Weather();
        String url = finalUrl + "&q=" + city;
        JSONObject jsonObject = null;

        try {
            jsonObject = new JSONObject(
                    IOUtils.toString(new URL(url),
                            Charset.forName("UTF-8")));


        } catch (IOException e) {
            e.printStackTrace();
        }
        weather.setIconUrl(jsonObject.getJSONObject("current").getJSONObject("condition").get("icon").toString());
        weather.setTemperature((Double) jsonObject.getJSONObject("current").get("temp_c"));
        weather.setConditionText(jsonObject.getJSONObject("current").getJSONObject("condition").get("text").toString());
        return weather;
    }
}

