package Observer.Models;

import Observer.Interfaces.ObserverInterface;
import Observer.Interfaces.PublisherInterface;
import java.util.ArrayList;

public class WeatherStation implements PublisherInterface, Runnable {
    private final ArrayList<ObserverInterface> observers;
    private boolean running;
    private int temperature;

    public WeatherStation() {
        updateTemperature();
        observers = new ArrayList<>();
        running = true;
    }

    @Override
    public void run() {
        while (running) {
            updateTemperature();
            notifyObservers();
            try {
                // Sleep for between 1 and 3 seconds.
                int sleepTime = (int) (Math.random() * 2000)+1000;
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public void stop() {
        running = false;
    }




    @Override
    public void addObserver(ObserverInterface observer) {
        System.out.println("Adding observer: " + observer.getName());
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        System.out.println("Removing observer: " + observer.getName());
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message = "Temperature is " + this.getTemperature();
        System.out.println("Notifying observers: ");
        for (ObserverInterface observer : observers) {
            observer.update(message);
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
