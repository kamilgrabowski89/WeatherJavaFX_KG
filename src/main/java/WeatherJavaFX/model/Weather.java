package WeatherJavaFX.model;

public class Weather {

    public Weather() {
    }


    private String iconUrl;
    private double temperature;
    private String conditionText;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    public Weather(String iconUrl, double temperature, String conditionText) {
//iconURL tutaj muszę użyć ImageView
        this.iconUrl = iconUrl;
        this.temperature = temperature;
        this.conditionText = conditionText;
    }
}
