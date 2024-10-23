/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class DispensingState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Please wait. Dispensing product.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please wait. Dispensing product.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Dispensing product. Please take your item.");

        // Just for testing
        vendingMachine.setState(vendingMachine.getOutOfStockState());
    }

}
