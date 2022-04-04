package trafficlight.observer;
import java.util.ArrayList;
import java.util.List;

//GIT REPO: https://github.com/4n7oine/trafficlight2021ObserverPattern_4n7oine

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
