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
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("\nTea: ");
        tea.prepare();

        System.out.println("\nCoffee: ");
        coffee.prepare();
    }

}
