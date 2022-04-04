package trafficlight.gui;


import javax.swing.*;
import java.awt.*;

//GIT REPO: https://github.com/4n7oine/trafficlight2021ObserverPattern_4n7oine

class Light extends JPanel {
    Color on;
    int radius = 40;
    int border = 10;
    boolean isOn = false;

    Light(Color color){
        on = color;
    }

    public Dimension getPreferredSize(){
        int size = (radius+border)*2;
        return new Dimension( size, size );
    }

    public void paintComponent(Graphics g){
        g.setColor( Color.black );
        g.fillRect(0,0,getWidth(),getHeight());

        if (isOn){
            g.setColor( on );
        } else {
            g.setColor( on.darker().darker().darker() );
        }
        g.fillOval( border,border,2*radius,2*radius );
    }
}