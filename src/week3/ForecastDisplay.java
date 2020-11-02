package week3;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {



    @Override
    public void update(Observable o, Object arg) {

        WeatherData wData = (WeatherData) o;
        System.out.println("forecast temperature = " + wData.getTemperature() +
                " forecast humidity = " + wData.getHumidity() +
                " forecast pressure = " + wData.getPressure());

    }
}
