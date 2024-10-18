/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private final OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        this.oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSeconedSelection() {
        this.oldCoffeeMachine.selectB();
    }

}
