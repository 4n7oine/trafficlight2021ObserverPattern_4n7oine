package trafficlight.gui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    @Test
    @DisplayName("TestBooleanMethode_to_turn_of_and_on")
    void turnOnTst() {
        boolean expected = true;
        TrafficLight trafficLight = new TrafficLight(Color.green);
        trafficLight.turnOn(true);
        boolean result = trafficLight.isOn();
        assertEquals(result,expected);
    }


}