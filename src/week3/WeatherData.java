package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
    private int temperature;
    private int humidity;
    private int pressure;

    List<Observer> observers = new ArrayList<>();


    //Introduce instance variable for new display

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setMeasurements(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }


}
