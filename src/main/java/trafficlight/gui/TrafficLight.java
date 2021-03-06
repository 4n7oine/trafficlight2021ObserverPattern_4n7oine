package trafficlight.gui;


import trafficlight.observer.Observer;

import java.awt.*;
import java.io.ObjectStreamConstants;

//GIT REPO: https://github.com/4n7oine/trafficlight2021ObserverPattern_4n7oine

public class TrafficLight extends Light implements Observer {

    public TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    //TODO implement a part of the pattern here
    @Override
    public void update() {
        if(isOn==true){
            turnOn(false);
        }else{
            turnOn(true);
        }
    }


}
