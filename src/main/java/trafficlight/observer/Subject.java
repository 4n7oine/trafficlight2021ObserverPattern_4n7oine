package trafficlight.observer;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update();
        }
    }
}
