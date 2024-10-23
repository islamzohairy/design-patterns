/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class OutOfStockState implements VendingMachineState {

    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Cannot insert coin. Machine is out of stock.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Cannot insert coin. Machine is out of stock.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Cannot insert coin. Machine is out of stock.");
    }

}
