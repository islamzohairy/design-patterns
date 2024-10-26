/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class SmartThermostat extends Device {

    public SmartThermostat(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Thermostat sends: " + message);
        mediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Thermostat receives: " + message);
    }

}
