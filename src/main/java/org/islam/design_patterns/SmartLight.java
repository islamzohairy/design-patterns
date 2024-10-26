/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class SmartLight extends Device {

    public SmartLight(SmartHomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Smart Light sends: " + message);
        mediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("Smart Light receives: " + message);
    }

}
