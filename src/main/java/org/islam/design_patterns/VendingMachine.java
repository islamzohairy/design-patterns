/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class VendingMachine {

    private final VendingMachineState idleState;
    private final VendingMachineState coinInsertedState;
    private final VendingMachineState dispensingState;
    private final VendingMachineState outOfStockState;

    private VendingMachineState currentState;

    public VendingMachine() {
        this.idleState = new IdleState();
        this.coinInsertedState = new CoinInsertedState();
        this.dispensingState = new DispensingState();
        this.outOfStockState = new OutOfStockState();

        this.currentState = this.idleState;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

    public VendingMachineState getIdleState() {
        return this.idleState;
    }

    public VendingMachineState getCoinInsertedState() {
        return this.coinInsertedState;
    }

    public VendingMachineState getDispensingState() {
        return this.dispensingState;
    }

    public VendingMachineState getOutOfStockState() {
        return this.outOfStockState;
    }
}
