package week3;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        WeatherData wData = (WeatherData) o;
        System.out.println("temperature = " + wData.getTemperature() +
                " humidity = " + wData.getHumidity() +
                "pressure = " + wData.getPressure());

    }
}
