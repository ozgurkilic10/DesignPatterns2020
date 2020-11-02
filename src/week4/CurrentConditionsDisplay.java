package week4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        WeatherInfo wData = (WeatherInfo) evt.getNewValue();
        System.out.println("temperature = " + wData.getTemperature() +
                " humidity = " + wData.getHumidity() +
                "pressure = " + wData.getPressure());

    }




}
