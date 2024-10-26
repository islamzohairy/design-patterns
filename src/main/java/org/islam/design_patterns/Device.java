/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public abstract class Device {

    protected SmartHomeMediator mediator;

    public Device(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
