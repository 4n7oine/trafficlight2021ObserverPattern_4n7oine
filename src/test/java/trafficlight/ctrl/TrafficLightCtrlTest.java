package trafficlight.ctrl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.gui.TrafficLight;
import trafficlight.states.State;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightCtrlTest {

    @Test
    @DisplayName("TestGreenNextState")
    void test_Green_Next_State() {
        TrafficLightCtrl trafficLightCtrl = TrafficLightCtrl.getInstance();
        State expected = trafficLightCtrl.getGreenState();
        State actual = trafficLightCtrl.getGreenState().;
        assertEquals(expected,actual);
    }
}