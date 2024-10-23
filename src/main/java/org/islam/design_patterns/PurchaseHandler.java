/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public abstract class PurchaseHandler {

    protected PurchaseHandler nexHandler;

    public void setNextHandler(PurchaseHandler nexHandler) {
        this.nexHandler = nexHandler;
    }

    public abstract void handle(PurchaseRequest purchaseRequest);
}
