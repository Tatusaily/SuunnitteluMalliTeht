package Observer.Interfaces;

public interface PublisherInterface {
    public void addObserver(ObserverInterface observer);
    public void removeObserver(ObserverInterface observer);
    public void notifyObservers();

}
