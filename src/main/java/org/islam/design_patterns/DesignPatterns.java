/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.islam.design_patterns;

import org.islam.design_patterns.factories.BudgetKnifeFactory;
import org.islam.design_patterns.factories.KnifeFactory;
import org.islam.design_patterns.factories.NormalKnifeFactory;
import org.islam.design_patterns.knives.Knife;

/**
 *
 * @author 20114
 */
public class DesignPatterns {

    public static void main(String[] args) {
        // init factories
        final KnifeFactory normalFactory = new NormalKnifeFactory();
        final KnifeFactory budgetFactory = new BudgetKnifeFactory();

        // ordring kitchen knives
        Knife kitchenKnife = normalFactory.orderKnife(KnifeType.KITCHEN);
        Knife budgetKitchenKnife = budgetFactory.orderKnife(KnifeType.KITCHEN);

        // ordring steak knives
        Knife steakKnife = normalFactory.orderKnife(KnifeType.STEAK);
        Knife budgetSteakKnife = budgetFactory.orderKnife(KnifeType.STEAK);

        // change the normal prices
        steakKnife.setPrice(18);
        kitchenKnife.setPrice(25);

        // show knives
        System.out.println("Normal steak knife: " + steakKnife.getPrice() + "$");
        budgetSteakKnife.showAdMessage();

        System.out.println("Normal kitchen knife: " + kitchenKnife.getPrice() + "$");
        budgetKitchenKnife.showAdMessage();

    }
}
