package trafficlight.ctrl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.gui.TrafficLight;
import trafficlight.states.State;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightCtrlTest {

    TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
    State firstCurrentState = ctrl.getCurrentState();
    State firstPreviousState = ctrl.getPreviousState();

    @BeforeEach
    void setup(){
        System.out.println("Call setup");
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        System.out.println(ctrl.hashCode());
        ctrl.setPreviousState(firstPreviousState);
        ctrl.setCurrentState(firstCurrentState);
    }

    @Test
    @DisplayName("TestCtrlOneTurn")
    void test_complett_turn_with_Next_State() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.setCurrentState(firstCurrentState);
        ctrl.setPreviousState(firstPreviousState);
        ctrl.nextState();
        String actual = ctrl.getCurrentState().getColor();
        String expected = "yellow";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Start_the_Trafficlightctrl_with_green")
    void test_Start_traffic_light() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        String actual = ctrl.getGreenState().getColor();
        String expected = "green";
        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("GetState_after_Yellow_after_Red")
    void test_one_tick_forward() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.setCurrentState(ctrl.getYellowState());
        ctrl.setPreviousState(ctrl.getRedState());
        ctrl.nextState();
        String actual = ctrl.getCurrentState().getColor();
        String expected = "green";
        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("GetState_after_Yellow_after_Green")
    void test_yellow_after_green() {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.setCurrentState(ctrl.getYellowState());
        ctrl.setPreviousState(ctrl.getGreenState());
        ctrl.nextState();
        String actual = ctrl.getCurrentState().getColor();
        String expected = "red";
        assertEquals(actual,expected);
    }



    @Test
    @DisplayName("TestSingleton_if_same_instance")
    void test_singleton() {
        TrafficLightCtrl first = TrafficLightCtrl.getInstance();
        TrafficLightCtrl second = TrafficLightCtrl.getInstance();
        assertEquals(first,second);
    }
}