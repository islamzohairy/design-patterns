/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class Broker1 implements StocksObserver {

    @Override
    public void update(String stock, double price) {
        System.out.println("Broker1: " + stock + "\t" + price + "\n");
    }

}
