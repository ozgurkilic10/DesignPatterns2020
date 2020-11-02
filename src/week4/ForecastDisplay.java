package week4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        WeatherInfo wData = (WeatherInfo) evt.getNewValue();
        System.out.println("forecast temperature = " + wData.getTemperature() +
                " forecast humidity = " + wData.getHumidity() +
                " forecast pressure = " + wData.getPressure());

    }
}
