/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding cinnamon, cloves and sugar...");
    }

}
