/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.islam.design_patterns;

import org.islam.design_patterns.models.Item;
import org.islam.design_patterns.models.Order;

/**
 *
 * @author 20114
 */
public class DesignPatterns {

    public static void main(String[] args) {
        // Init proxy warehouse
        IWarehouse warehouse = new WarehouseProxy();

        // Create first order
        Order order = new Order();

        order.addItem(new Item("Laptop", 5));
        order.addItem(new Item("Smartphone", 20));

        warehouse.processOrder(order);

        // Create seconed order
        Order order2 = new Order();

        order2.addItem(new Item("Laptop", 20));
        order2.addItem(new Item("Smartphone", 30));

        warehouse.processOrder(order2);

    }
}
