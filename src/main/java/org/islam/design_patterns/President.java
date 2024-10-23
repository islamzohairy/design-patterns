/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

/**
 *
 * @author 20114
 */
public class President extends PurchaseHandler {

    @Override
    public void handle(PurchaseRequest purchaseRequest) {
        System.out.println("President approved request for $" + purchaseRequest.getAmount());
    }

}
