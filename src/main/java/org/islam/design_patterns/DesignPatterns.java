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
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter adabtor = new CoffeeTouchscreenAdapter(oldCoffeeMachine);

        adabtor.chooseSeconedSelection();
        adabtor.chooseSeconedSelection();
        adabtor.chooseFirstSelection();
    }
}
