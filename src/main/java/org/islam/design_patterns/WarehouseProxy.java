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
public class WarehouseProxy implements IWarehouse {

    private final Warehouse warehouse = new Warehouse();

    @Override
    public void processOrder(Order order) {
        boolean isAllItemsAvailable = true;
        List<Item> items = order.getItems();

        for (Item item : items) {
            HashMap<String, Integer> stock = warehouse.getStock();
            String itemName = item.getName();
            int itemQuantity = item.getQuantity();

            if (!stock.containsKey(itemName) || stock.get(itemName) < itemQuantity) {
                isAllItemsAvailable = false;
                System.out.println(itemName + " is not available! (" + stock.get(itemName) + ") left in stock");
            } else {
                System.out.println("Available " + stock.get(itemName) + " of " + itemName);
            }
        }

        if (isAllItemsAvailable == true) {
            warehouse.processOrder(order);
        } else {
            System.out.println("Can not proceed because not all the items are available!");
        }
    }

}
