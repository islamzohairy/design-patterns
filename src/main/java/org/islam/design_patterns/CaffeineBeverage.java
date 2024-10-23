/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public abstract class CaffeineBeverage {

    public final void prepare() {
        boilWater();
        brew();
        pour();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pour() {
        System.out.println("Pouring into cup...");
    }

    abstract void brew();

    abstract void addCondiments();

}
