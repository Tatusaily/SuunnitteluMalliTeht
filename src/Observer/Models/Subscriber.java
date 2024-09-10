package Observer.Models;

import Observer.Interfaces.ObserverInterface;

public class Subscriber implements ObserverInterface {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Subscriber " + this.name + " received message: " + message);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
