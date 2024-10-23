/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class IdleState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted. You can now select a product.");
        vendingMachine.setState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert a coin first.");

    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert a coin first.");
    }

}
