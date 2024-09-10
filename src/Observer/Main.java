package Observer;

import Observer.Models.WeatherStation;
import Observer.Models.Subscriber;


public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        Subscriber subscriber3 = new Subscriber("Subscriber 3");

        weatherStation.addObserver(subscriber1);
        weatherStation.addObserver(subscriber2);
        weatherStation.addObserver(subscriber3);

        Thread weatherStationThread = new Thread(weatherStation);
        weatherStationThread.start();

        System.out.println("Main thread sleeping for 6 seconds");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.removeObserver(subscriber2);

    }
}
