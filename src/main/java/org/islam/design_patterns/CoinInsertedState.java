/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class CoinInsertedState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin already inserted. Select a product.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Product selected. Dispensing product...");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Select a product first.");
    }

}
