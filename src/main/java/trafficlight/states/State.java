package trafficlight.states;

//TODO implement a part of the pattern here

import trafficlight.observer.Subject;

//GIT REPO: https://github.com/4n7oine/trafficlight2021ObserverPattern_4n7oine

public abstract class State extends Subject {

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }
}