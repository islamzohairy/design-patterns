/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20114
 */
public class SmartHomeMediatorImpl implements SmartHomeMediator {

    private final Map<String, Device> devices = new HashMap<>();

    @Override
    public void send(Device device, String message) {
        this.devices.values().forEach(d -> {
            if (!d.equals(device)) {
                d.receive(message);
            }
        });
    }

    public void setDevice(String id, Device device) {
        this.devices.put(id, device);
    }

}
