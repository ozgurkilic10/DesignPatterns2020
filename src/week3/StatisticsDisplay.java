package week3;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {



    @Override
    public void update(Observable o, Object arg) {
        WeatherData wData = (WeatherData) o;
        System.out.println("Avg temperature = " + wData.getTemperature()
                + " Avg humidity = " +wData.getHumidity()+
                " Avg pressure = " + wData.getPressure());
    }
}
