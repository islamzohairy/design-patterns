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
        ICoffee myCoffee = new BasicCoffee();

        myCoffee = new ExtraShotDecorator(myCoffee);
        myCoffee = new MilkDecorator(myCoffee);
        myCoffee = new SugarDecorator(myCoffee);

        System.out.println(myCoffee.getDescription() + "\n\n  total \t " + myCoffee.getPrice());

    }
}
