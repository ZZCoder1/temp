// Steve Klein
// filename Motorcycle2.java

import java.awt.*;

public class Motorcycle2 extends java.applet.Applet {
        static String numWheels = "two";
        String make = "Honda 750";
        String color = "silver";
        int numOfCylinders = 4;
        boolean engineState = false;
        Button engineOnButton = new Button("Start Engine");
        Button engineOffButton = new Button("Stop Engine");
        TextField showAtts = new TextField("The motorcycle is a " + numOfCylinders + "-cylinder "
                + color + " " + make + " with " + numWheels + " wheels.");
        TextField showEngineState = new TextField("The motor is not running.");
        
        public void init() {
                setBackground(Color.white);
                add(showAtts);
                add(showEngineState);
                add(engineOnButton);
                add(engineOffButton);
        } // end init

        public boolean action(Event evt, Object arg) {
                if (evt.target instanceof Button) {
                        buttonsMain((Button)evt.target);
                        return true;
                } // end if
                return false;
        } // end actOnMotorcycle, which checks for user input
        
        void buttonsMain(Button b) {
                if (b == engineOnButton) startEngine();
                else if (b == engineOffButton) stopEngine();
        
        }  /* end buttonsMain, which checks to see which button has been pressed, and calls the
              corresponding method */

        void startEngine() {
                if (engineState == true)
                        showEngineState.setText("The motor is already running!");
                else {
                        engineState = true;
                        showEngineState.setText("The motor is now running.");
                } // end if
        } // end method startEngine
        
        void stopEngine() {
                if (engineState == false)
                        showEngineState.setText("The motor isn't running!");
                else {
                        engineState = false;
                        showEngineState.setText("The motor has been stopped.");
                } // end if
        } // end method stopEngine

} // end applet Motorcycle2

