/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

import java.util.HashMap;
import java.util.List;

import org.islam.design_patterns.models.Item;
import org.islam.design_patterns.models.Order;

/**
 *
 * @author 20114
 */
public class Warehouse implements IWarehouse {

    private final HashMap<String, Integer> stock = new HashMap<>();

    public Warehouse() {
        // Initialize with some stock
        stock.put("Laptop", 10);
        stock.put("Smartphone", 20);
    }

    @Override
    public void processOrder(Order order) {
        List<Item> items = order.getItems();
        int totalQuantity = 0;

        // Process stock
        for (Item item : items) {
            String itemName = item.getName();
            Integer itemQuantity = item.getQuantity();
            System.out.println("Processing order for\t(" + itemQuantity + ") of " + itemName);

            stock.put(item.getName(), this.stock.get(item.getName()) - item.getQuantity());
            totalQuantity += itemQuantity;
        }

        // Process shipment
        System.out.println("Processing for shipment of (" + items.size() + ") items, total (" + totalQuantity + ")");
    }

    public HashMap<String, Integer> getStock() {
        return this.stock;
    }

}
