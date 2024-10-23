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
        VendingMachine machine = new VendingMachine();

        // Select product without inserting a coin
        machine.selectProduct();

        // Insert a coin to buy the last item in the machine
        machine.insertCoin();
        machine.selectProduct();
        machine.dispenseProduct();

        // try to insert a coin while the machine is out of stock
        machine.insertCoin();
    }
}
