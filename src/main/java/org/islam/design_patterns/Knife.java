/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public abstract class Knife {

    private final KnifeType type;
    private double price;

    public Knife(KnifeType type, double price) {
        this.type = type;
        this.price = price;
    }

    public KnifeType getType() {
        return this.type;
    }

    public abstract void sharpen();

    public abstract void polish();

    public abstract void pack();

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

}
