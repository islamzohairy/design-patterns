/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class DesignPatterns {

    public static void main(String[] args) {
        SmartHomeMediatorImpl mediator = new SmartHomeMediatorImpl();

        SmartLight light = new SmartLight(mediator);
        SmartThermostat thermostat = new SmartThermostat(mediator);

        mediator.setDevice("1", light);
        mediator.setDevice("2", thermostat);

        light.send("Light is ON");
        System.out.println("");

        thermostat.send("Temperature is 22°C");
        System.out.println("");

        light.receive("Turn OFF");
        thermostat.receive("Set temperature to 24°C");

    }
}
