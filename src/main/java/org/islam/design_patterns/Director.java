/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class Director extends PurchaseHandler {

    private final double limit = 5000.0;

    @Override
    public void handle(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() <= this.limit) {
            System.out.println("Director approved request for $" + purchaseRequest.getAmount());
        } else if (super.nexHandler != null) {
            super.nexHandler.handle(purchaseRequest);
        }
    }

}
