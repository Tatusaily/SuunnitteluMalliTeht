package Observer.Models;

import Observer.Interfaces.ObserverInterface;
import Observer.Interfaces.PublisherInterface;
import java.util.ArrayList;

public class WeatherStation implements PublisherInterface {
    private ArrayList<ObserverInterface> observers;
    private int temperature;
    
    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update();
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void updateTemperature() {
        // Simulate weather change
        // Can't go below -20 or above 40
        // Changes by -5 to 5 degrees
        int newTemperature = Math.clamp(
            this.getTemperature() 
            + (int) (Math.random() * 10) - 5
            , -20, 40);

        this.setTemperature(newTemperature);
    }

    

}
