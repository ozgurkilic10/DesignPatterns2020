package week4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        WeatherInfo wData = (WeatherInfo) evt.getNewValue();
        System.out.println("Avg temperature = " + wData.getTemperature()
                + " Avg humidity = " +wData.getHumidity()+
                " Avg pressure = " + wData.getPressure());
    }
}
