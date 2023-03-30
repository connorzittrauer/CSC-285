/*  Name: Connor Zittrauer
 *  Course: CSC 285
 *  Project: Command Pattern
 *  File Name: LightSwitch.java
 */

/* This class provides a concrete controller for a generic 'Light'" */
package Objects;

public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("The " + name + " has been turned on.");
    }

    public void turnOff() {
        System.out.println("The " + name + " has been turned off.");
    }

}
