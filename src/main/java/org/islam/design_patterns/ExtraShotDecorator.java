/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class ExtraShotDecorator extends CoffeeDecorator {

    public ExtraShotDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n + Extra shot \t 1.5";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

}
