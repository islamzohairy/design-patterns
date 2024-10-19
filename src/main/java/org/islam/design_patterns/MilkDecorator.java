/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n + Milk \t 0.5";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

}
