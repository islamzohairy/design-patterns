/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.islam.design_patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 20114
 */
public class StockMarket {

    protected Map<String, Double> stocks = new HashMap<>();
    protected List<StocksObserver> observers = new ArrayList<>();

    public void addObserver(StocksObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StocksObserver observer) {
        observers.remove(observer);
    }

    public void addStock(String name, double price) {
        stocks.put(name, price);
        notifyObservers(name, price);
    }

    public void notifyObservers(String name, double price) {
        for (StocksObserver observer : this.observers) {
            observer.update(name, price);
        }
    }

}
