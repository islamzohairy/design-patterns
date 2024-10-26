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
        StockMarket stockMarket = new StockMarket();

        StocksObserver broker1 = new Broker1();
        StocksObserver broker2 = new Broker2();

        stockMarket.addObserver(broker1);
        stockMarket.addObserver(broker2);

        stockMarket.addStock("AAPL", 150.00);
        stockMarket.addStock("GOOGL", 2800.00);

        stockMarket.removeObserver(broker2);

        stockMarket.addStock("AAPL", 155.00);
        stockMarket.addStock("GOOGL", 2825.00);
    }
}
