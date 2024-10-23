/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public interface VendingMachineState {

    void insertCoin(VendingMachine vendingMachine);

    void selectProduct(VendingMachine vendingMachine);

    void dispenseProduct(VendingMachine vendingMachine);
}
