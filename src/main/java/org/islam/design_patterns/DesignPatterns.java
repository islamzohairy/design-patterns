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
        PurchaseHandler manager = new Manager();
        PurchaseHandler director = new Director();
        PurchaseHandler president = new President();

        manager.setNextHandler(director);
        director.setNextHandler(president);

        PurchaseRequest purchase1 = new PurchaseRequest(500.0);
        PurchaseRequest purchase2 = new PurchaseRequest(2000.0);
        PurchaseRequest purchase3 = new PurchaseRequest(10000.0);

        manager.handle(purchase1);
        manager.handle(purchase2);
        manager.handle(purchase3);

    }
}
